package top.maybe123.controller;


import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.portable.OutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.maybe123.pojo.BysjAuthor;
import top.maybe123.service.AuthorServicce;
import top.maybe123.tool.FaceInfo;
import top.maybe123.tool.ImageOutPut;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.*;
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

    @RequestMapping(value = "upface.action",method= RequestMethod.POST)
    public @ResponseBody
    String getFace(@RequestParam("pp") MultipartFile file, HttpServletRequest httpServletRequest
    , HttpServletResponse httpServletResponse) throws IOException {

        Thread th=new Thread(new ImageOutPut(file));
        th.start();
        return FaceInfo.detect(file.getBytes());
    }

}
