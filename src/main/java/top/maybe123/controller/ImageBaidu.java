package top.maybe123.controller;


import jdk.nashorn.internal.parser.JSONParser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjAuthor;
import top.maybe123.service.AuthorServicce;

import java.util.List;

/*
* 处理图片识别
* @author pdd
*/
@Controller
public class ImageBaidu {


    @Autowired
    AuthorServicce authorServicce;
    @RequestMapping(value = "/getAuthor.action")
    public  @ResponseBody List<BysjAuthor> getAuthor(@Param("name") String name){

        return   authorServicce.getAuthorByname(name);
    }

}
