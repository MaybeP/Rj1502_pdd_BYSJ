package top.maybe123.controller;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.maybe123.pojo.BysjAuthor;
import top.maybe123.service.AuthorServicce;
import top.maybe123.service.ImgService;
import top.maybe123.tool.ImageOutPut;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/*
* 处理图片识别
* @author pdd
*/
@Controller
public class ImageBaidu {


    @Autowired
    AuthorServicce authorServicce;
    @Autowired
    ImgService imgService;
    
  

    @RequestMapping(value = "/uptext.action",method= RequestMethod.POST)
    public void getFace(@RequestParam("imag") MultipartFile file,@RequestParam("imag_name")String url
            , HttpServletRequest request
    , HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Origin","127.0.0.1:8080");
        response.setHeader("Access-Control-Allow-Methods","POST,DELETE,GET,OPTIONS");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,Content-Type");
        imgService.addtextImg(file,url);
    }

    @RequestMapping(value = "upface.action",method= RequestMethod.POST)
    public void insertImag(@RequestParam("imag") MultipartFile file,
            @RequestParam("imag_name")String url, HttpServletRequest request
            , HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Origin","127.0.0.1:8080");
        response.setHeader("Access-Control-Allow-Methods","POST,DELETE,GET,OPTIONS");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,Content-Type");
        imgService.addfaceImg(file,url);
    }


}
