package top.maybe123.controller;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.maybe123.pojo.BysjImgurl;
import top.maybe123.service.AuthorServicce;
import top.maybe123.service.ImgService;

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
    
  
//上传图片文字识别的接口
    @RequestMapping(value = "/uptext.action",method= RequestMethod.POST)
    public @ResponseBody String uptext(@RequestParam("imag") MultipartFile file,@RequestParam("imag_name")String url
            , HttpServletRequest request
    , HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
//        response.setHeader("Access-Control-Allow-Origin","127.0.0.1:8080");
        response.setHeader("Access-Control-Allow-Methods","POST,DELETE,GET,OPTIONS");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,Content-Type");
        return imgService.addtextImg(file,url);

    }
//上传人脸识别的接口
    @RequestMapping(value = "upface.action",method= RequestMethod.POST)
    public @ResponseBody String insertImag(@RequestParam("imag") MultipartFile file,
            @RequestParam("imag_name")String url, HttpServletRequest request
            , HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
//        response.setHeader("Access-Control-Allow-Origin","127.0.0.1:8080");
        response.setHeader("Access-Control-Allow-Methods","POST,DELETE,GET,OPTIONS");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,Content-Type");



      return   imgService.addfaceImg(file,url);
    }
    
    //得到图片json
    @RequestMapping("getImageJson.action")
    public @ResponseBody
    BysjImgurl getImageJson(@Param("url") String url){

        return imgService.getJson(url);
    }

    //上传文章插图
    @RequestMapping(value = "upimage",method = RequestMethod.POST)
    public @ResponseBody String upImag(@RequestParam("imag") MultipartFile file,
                                       @RequestParam("imag_name")String url, HttpServletRequest request
            , HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin","*");
//        response.setHeader("Access-Control-Allow-Origin","127.0.0.1:8080");
        response.setHeader("Access-Control-Allow-Methods","POST,DELETE,GET,OPTIONS");
        response.setHeader("Access-Control-Max-Age","3600");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,Content-Type");
        return   imgService.upImage(file,url);
    }
}
