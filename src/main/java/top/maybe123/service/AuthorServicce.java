package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.maybe123.dao.BysjAuthorMapper;
import top.maybe123.dao.base.BysjAuthorBaseMapper;
import top.maybe123.pojo.BysjAuthor;

import java.util.Iterator;
import java.util.List;


/*
** 作者信息查询
*  @author pdd
 */
@Service
public class AuthorServicce  {

@Autowired
BysjAuthorBaseMapper bysjAuthorBaseMapper;
//查询指定id作者
public BysjAuthor getAuthor(int id){
    BysjAuthor bysjAuthor=new BysjAuthor();
    bysjAuthor.setId(id);
    return bysjAuthorBaseMapper.queryBysjAuthorLimit1(bysjAuthor);
}
//查询所有作者列表
    public List<BysjAuthor> getAuthorList(String name){
	BysjAuthor bysjAuthor=new BysjAuthor();
	bysjAuthor.setAu_name(name);
	return bysjAuthorBaseMapper.queryBysjAuthor(bysjAuthor);
    }
    //通过姓名查询
	public BysjAuthor getAuthor(String name) {
		BysjAuthor bysjAuthor=new BysjAuthor();
		bysjAuthor.setAu_name(name);
		return bysjAuthorBaseMapper.queryBysjAuthorLimit1(bysjAuthor);
	}
	//查询所有相同姓名作者
	public List<BysjAuthor> getAuthorNameAll(String name){
		BysjAuthor bysjAuthor=new BysjAuthor();
		bysjAuthor.setAu_name(name);
	return bysjAuthorBaseMapper.queryBysjAuthor(bysjAuthor);
	}
	//更新作者信息
	public void updateAuthor( List<BysjAuthor> list){
	for(Iterator<BysjAuthor> it=list.iterator();it.hasNext();)
		bysjAuthorBaseMapper.updateBysjAuthor(it.next());
     }
     //删除作者信息,不设置删除
	public void deleteAuthor(List<BysjAuthor> list){
	
	
	}
}
