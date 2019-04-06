package top.maybe123.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjProse;
import top.maybe123.service.ProseService;

import java.util.List;

@Controller
public class ProseController {

	@Autowired
	ProseService proseService;
	
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
	public void updateProse(@Param("Prose")BysjProse bysjProse){
		proseService.updateProse(bysjProse);
	}
	
	//插入文章
	@RequestMapping("insertProse.action")
	public void insertProses(@Param("proses")List<BysjProse> list){
		proseService.insertProse(list);
	}
	
	//删除文章
	@RequestMapping("deleteProse.action")
	public void deleteProse(@Param("prose")BysjProse bysjProse){
		proseService.deleteProse(bysjProse);
	}
	
}
