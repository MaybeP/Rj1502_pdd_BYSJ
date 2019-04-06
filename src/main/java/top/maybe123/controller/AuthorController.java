package top.maybe123.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjAuthor;
import top.maybe123.service.AuthorServicce;

import java.util.List;

/*
*@author 潘登登
* 处理有关作者的controller
*
 */
@Controller
public class AuthorController {
	@Autowired
	AuthorServicce authorServicce;
	//得到一个作者信息
	@RequestMapping(value = "/getAuthorOne.action")
	public  @ResponseBody BysjAuthor getAuthor(@Param("id") Integer id,@Param("name") String name){
		BysjAuthor bysjAuthor;
		if(name==null){
		bysjAuthor=authorServicce.getAuthor(id);
		}
		else {
			bysjAuthor=authorServicce.getAuthor(name);
		}
		return bysjAuthor;
	}
	//获取所有作者信息
	@RequestMapping(value = "/getAuthorAll.action")
	public @ResponseBody
	List<BysjAuthor> getAuthorAll(@Param("name")String name){
			return authorServicce.getAuthorList(name);
	}
	
}
