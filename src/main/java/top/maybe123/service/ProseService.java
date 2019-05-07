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
		return bysjProseBaseMapper.queryBysjProseLimit1(bysjProse);
	}
	
	//插入文章信息
	public void insertProse(List<BysjProse> list){
		for(Iterator<BysjProse> it=list.iterator();it.hasNext();){
			bysjProseBaseMapper.insertBysjProse(it.next());
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
		BysjProse.QueryBuilder queryBuilder=BysjProse.QueryBuild();
		queryBuilder.IdBetWeen((page-1)*16,page*16);
		return bysjProseBaseMapper.queryBysjProse(queryBuilder);

	}
}
