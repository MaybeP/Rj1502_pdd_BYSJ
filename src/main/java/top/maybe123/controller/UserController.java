package top.maybe123.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjAuditing;
import top.maybe123.pojo.BysjUser;
import top.maybe123.service.AuditingService;
import top.maybe123.service.UserService;

/*
*@author pdd
* 用户注册相关
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	AuditingService auditingService;
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
	@RequestMapping(value = "updateUser.action",method = RequestMethod.POST)
	public @ResponseBody String updateUser(@Param("user") String user){

		Gson gson=new Gson();
		BysjUser User= gson.fromJson(user,BysjUser.class);
		userService.updateUser(User);
		return "成功！";

	}
	//注销
	@RequestMapping("deleteUser.action")
	public void deleteUser(@Param("user") BysjUser bysjUser){
		userService.deleteUser(bysjUser);
	}
	//注册用户
	@RequestMapping(value = "insertUser.action",method = RequestMethod.POST)
	public @ResponseBody String insertUser(@Param("user")String user){
		Gson gson=new Gson();
		BysjUser User= gson.fromJson(user,BysjUser.class);

		//插入审核信息
		BysjAuditing bysjAuditing=new BysjAuditing();
		bysjAuditing.setAud_classify(3);
		bysjAuditing.setAud_content(user);
		bysjAuditing.setAud_result(1);
		auditingService.insInfo(bysjAuditing);

		userService.insertUser(User);
		return "成功！";
	}
	//查询用户名是否存在
	@RequestMapping("getUser.action")
	public @ResponseBody BysjUser getUser(@Param("name")String name){
		BysjUser bysjUser=new BysjUser();
		bysjUser.setU_name(name);
		return userService.getUser(bysjUser);
	}
}
