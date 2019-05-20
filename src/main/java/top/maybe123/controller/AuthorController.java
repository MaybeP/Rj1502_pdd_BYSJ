package top.maybe123.controller;

import com.google.gson.Gson;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjAuditing;
import top.maybe123.pojo.BysjAuthor;
import top.maybe123.service.AuditingService;
import top.maybe123.service.AuthorServicce;

import java.util.Date;
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

	@Autowired
	AuditingService auditingService;
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

	//发送邮箱验证码
	@RequestMapping(value = "sendEmail.action")
	public @ResponseBody String sendEmail(@Param("e_mail")String e_mail){
		HtmlEmail email=new HtmlEmail();
		email.setHostName("smtp.qq.com");
		email.setCharset("utf-8");
		String re=new Date().toString();

		try {
			email.addTo(e_mail);
		} catch (EmailException e) {
			e.printStackTrace();
		}
		try {
			email.setFrom("532963277@qq.com","pdd");
		} catch (EmailException e) {
			e.printStackTrace();
		}
		email.setAuthentication("532963277@qq.com","qzppuravjfwvbihc");
			email.setSubject("你好，这是你的验证码!");
		try {
			email.setMsg("欢迎注册！验证码为："+re);
		} catch (EmailException e) {
			e.printStackTrace();
		}
		try {
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}

		return re;
	}
	//插入作者信息
	@RequestMapping(value = "insertAuthor.action",method = RequestMethod.POST)
	public @ResponseBody String insertUser(@Param("author")String author){
		Gson gson=new Gson();
		BysjAuthor User= gson.fromJson(author,BysjAuthor.class);
		//插入审核信息
		BysjAuditing bysjAuditing=new BysjAuditing();
		bysjAuditing.setAud_classify(1);
		bysjAuditing.setAud_content(author);
		bysjAuditing.setAud_result(1);
		auditingService.insInfo(bysjAuditing);

		authorServicce.insertAuthor(User);
		return "成功！";
	}
}
