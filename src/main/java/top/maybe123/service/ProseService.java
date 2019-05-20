package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.BysjProseMapper;
import top.maybe123.dao.base.BysjProseBaseMapper;
import top.maybe123.pojo.BysjProse;

import java.util.Iterator;
import java.util.List;
/*
*@author pdd
* 关于文章信息的处理服务
*
 */

@Service
public class ProseService {
	@Autowired
	BysjProseBaseMapper bysjProseBaseMapper;
	@Autowired
	BysjProseMapper bysjProseMapper;
	//查询多篇文章信息
	public List<BysjProse> getProse(String title){
		BysjProse bysjProse=new BysjProse();
		bysjProse.setProse_titl(title);
		return bysjProseBaseMapper.queryBysjProse(bysjProse);
	}
	
	//查询一篇文章信息
	public BysjProse getProseOne(String title){
		BysjProse bysjProse=new BysjProse();
		bysjProse.setProse_titl(title);
	 BysjProse	upda=bysjProseBaseMapper.queryBysjProseLimit1(bysjProse);
	 if(upda!=null){
	 upda.setProse_times(upda.getProse_times()+1);
	 bysjProseBaseMapper.updateBysjProse(upda);
	 }
	 return upda;
	}
	
	//插入文章信息
	public void insertProse(List<BysjProse> list){
		BysjProse.QueryBuilder queryBuilder=BysjProse.QueryBuild();
		for(Iterator<BysjProse> it=list.iterator();it.hasNext();){
			BysjProse bb=it.next();
			queryBuilder.setProse_titl(bb.getProse_titl());
			if(bysjProseBaseMapper.queryBysjProse(queryBuilder)!=null)
				bysjProseBaseMapper.updateBysjProse(bb);
			bysjProseBaseMapper.insertBysjProse(bb);
		}
	}
	
	//修改文章信息
	public  void updateProse(BysjProse bysjProse){
		bysjProseBaseMapper.updateBysjProse(bysjProse);
	}
	
	//删除文章信息
	public void deleteProse(BysjProse bysjProse){
		bysjProse.setProse_titl("bysj_delete");
		bysjProseBaseMapper.updateBysjProse(bysjProse);
	}
	//分页查询文章
	public List<BysjProse> getProsePage(int page){
		int st=(page-1)*16+1;
		int end=page*16+1;
		BysjProse.QueryBuilder queryBuilder=BysjProse.QueryBuild();queryBuilder.IdBetWeen(st,end);
		List<BysjProse> list=bysjProseBaseMapper.queryBysjProse(queryBuilder);
		for(Iterator<BysjProse> it=list.iterator();it.hasNext();){
			BysjProse bb=it.next();
			if(bb.getProse_titl().equals("delete_prose")){
				it.remove();
			}

		}
		return  list;

	}
	//推荐轮播图数据
	public List<BysjProse> getProseTj(){
		BysjProse.QueryBuilder queryBuilder=BysjProse.QueryBuild();
		queryBuilder.fuzzyProse_classify("推荐");
		return bysjProseBaseMapper.queryBysjProse(queryBuilder);
	}

}
