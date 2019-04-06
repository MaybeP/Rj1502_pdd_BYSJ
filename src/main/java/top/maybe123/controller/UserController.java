package top.maybe123.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjUser;
import top.maybe123.service.UserService;

/*
*@author pdd
* 用户注册相关
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
	//验证登录
	@RequestMapping("login.action")
	public @ResponseBody BysjUser login(@Param("u_name")String name,@Param("u_password")String password){
	BysjUser bysjUser=new BysjUser();
	bysjUser.setU_name(name);
	bysjUser.setU_password(password);
	BysjUser b1=userService.getUser(bysjUser);
	
	if (b1!=null){
		return b1;
	}
	else{
		return null;
	}
	}
	
	//修改用户信息
	@RequestMapping("updateUser.action")
	public void updateUser(@Param("user") BysjUser bysjUser){
		userService.updateUser(bysjUser);
	}
	//注销
	@RequestMapping("deleteUser.action")
	public void deleteUser(@Param("user") BysjUser bysjUser){
		userService.deleteUser(bysjUser);
	}
	//注册用户
	@RequestMapping("insertUser.action")
	public void insertUser(@Param("user") BysjUser bysjUser){
		userService.insertUser(bysjUser);
	}
	//查询用户名是否存在
	@RequestMapping("getUser.action")
	public @ResponseBody BysjUser getUser(@Param("name")String name){
		BysjUser bysjUser=new BysjUser();
		bysjUser.setU_name(name);
		return userService.getUser(bysjUser);
	}
}
