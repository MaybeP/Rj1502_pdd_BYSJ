package top.maybe123.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjComment;
import top.maybe123.service.CommentService;

import java.util.List;

/*
*@author pdd
*读后感信息处理
*/
@Controller
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	//获取多条读后感
	@RequestMapping("getComment.action")
	public @ResponseBody
	List<BysjComment> getComment(){
		return commentService.getComment();
	}
	
	//查询一条读后感
	@RequestMapping("getCommentOne.action")
	public  @ResponseBody
	BysjComment getCommentOne(@Param("text")String text){
		return commentService.getCommentOne(text);
	}
	
	//插入一条或多条读后感
	@RequestMapping("addComment.action")
	public void addComment(@Param("comment") List<BysjComment> list){
		commentService.insertBysjComment(list);
	}
	
	//更新一条读后感
	@RequestMapping("updateComment.action")
	public void updateComment(@Param("comment")BysjComment bysjComment){
		commentService.uopdate(bysjComment);
	}
	
	//删除一条读后感
	@RequestMapping("deleteComment.action")
	public void deleteComment(@Param("comment") BysjComment bysjComment){
		commentService.delete(bysjComment);
	}
}
