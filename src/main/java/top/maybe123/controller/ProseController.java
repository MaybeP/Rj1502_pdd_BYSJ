package top.maybe123.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjAuditing;
import top.maybe123.pojo.BysjComment;
import top.maybe123.pojo.BysjProse;
import top.maybe123.service.AuditingService;
import top.maybe123.service.ProseService;

import java.util.ArrayList;
import java.util.List;
/*
*@author pdd
* 散文处理相关
 */
@Controller
public class ProseController {

	@Autowired
	ProseService proseService;
	@Autowired
	AuditingService auditingService;
	//得到多篇文章
	@RequestMapping("getProse.action")
	public @ResponseBody
	List<BysjProse> getProse(@Param("title")String title){
		return proseService.getProse(title);
	}
	
	//查询一篇文章
	@RequestMapping("getProseOne.action")
	public @ResponseBody
	BysjProse getProseOne(@Param("title")String title){
		return  proseService.getProseOne(title);
	}
	
	//修改文章
	@RequestMapping("updateProse.action")
	public void updateProse(@Param("Prose")String Prose){
		Gson gson=new Gson();
		BysjProse bysjProse=gson.fromJson(Prose,BysjProse.class);
		proseService.updateProse(bysjProse);
	}
	
	//插入文章
	@RequestMapping("insertProse.action")
	public @ResponseBody String insertProses(@Param("proses")String proses){
		Gson gson=new Gson();
		List<BysjProse>  li=  gson.fromJson(proses,new TypeToken<ArrayList<BysjProse>>() {
		}.getType());

		//插入审核信息
		BysjAuditing bysjAuditing=new BysjAuditing();
		bysjAuditing.setAud_classify(2);
		bysjAuditing.setAud_content(proses);
		bysjAuditing.setAud_result(1);
		auditingService.insInfo(bysjAuditing);

		proseService.insertProse(li);
		return "success";
	}
	
	//删除文章
	@RequestMapping("deleteProse.action")
	public void deleteProse(@Param("prose")BysjProse bysjProse){
		proseService.deleteProse(bysjProse);
	}
	
	//分页查询文章
	@RequestMapping("getProsePage.action")
	public @ResponseBody List<BysjProse> getProsePage(@Param("page")int page){
		return proseService.getProsePage(page);
	}
	//查询首页轮播推荐
	@RequestMapping("getProseTj.action")
	public @ResponseBody List<BysjProse> getProseTj(){
		return proseService.getProseTj();
	}
	//获取页面总数
//	@RequestMapping("getProseCount.action")
//	public @ResponseBody int getProseCount(){ return proseService.getProseCount();}

}
