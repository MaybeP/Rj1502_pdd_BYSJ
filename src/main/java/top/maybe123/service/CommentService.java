package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.base.BysjCommentBaseMapper;
import top.maybe123.pojo.BysjComment;

import java.util.Iterator;
import java.util.List;

/*
**评论服务层
**@author pdd
 */
@Service
public class CommentService {

	@Autowired
	BysjCommentBaseMapper bysjCommentBaseMapper;
	//得到多条读后感信息
	public List<BysjComment> getComment(String title){
		BysjComment bysjComment=new BysjComment();
		bysjComment.setComment_title(title);
		return bysjCommentBaseMapper.queryBysjComment(bysjComment);
	}
	//得到一条读后感信息
	public BysjComment getCommentOne(String comment){
		
		BysjComment bysjComment=new BysjComment();
	    bysjComment.setComment_content(comment);
	    return bysjCommentBaseMapper.queryBysjCommentLimit1(bysjComment);
	}
	//插入读后感信息
	public  void insertBysjComment(List<BysjComment> list){
		
		for (Iterator<BysjComment> it=list.iterator();it.hasNext(); ){

			BysjComment by=it.next();
			by.setComment_times(by.getComment_times()+1);
			bysjCommentBaseMapper.insertBysjComment((BysjComment) by);
		}
	}
	//更新读后感
	public void update(BysjComment bysjComment){
		bysjCommentBaseMapper.updateBysjComment(bysjComment);
	}
	//删除读后感,没有真实的删除，仅仅是更新去掉联系
	public void delete(BysjComment bysjComment){
		bysjComment.setComment_title("bysj_delete");
		bysjCommentBaseMapper.updateBysjComment(bysjComment);
	}
}
