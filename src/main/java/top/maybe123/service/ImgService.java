package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.maybe123.dao.base.BysjImgurlBaseMapper;
import top.maybe123.pojo.BysjImgurl;
import top.maybe123.tool.FaceInfo;
import top.maybe123.tool.ImageOutPut;
import top.maybe123.tool.TextInfo;

import java.io.IOException;

/*
*@author pdd
* 处理关于图片上传以及识别
 */
@Service
public class ImgService {
   @Autowired
   BysjImgurlBaseMapper bysjImgurlBaseMapper;
   //添加面部识别结果
   public String addfaceImg(MultipartFile file,String url) throws IOException {
      BysjImgurl bysj;
      String json;
      String param=url+file.getOriginalFilename();
      bysj=getJson(param);
      if(bysj==null){
         bysj=new BysjImgurl();
         json=FaceInfo.detect(file.getBytes());
         bysj.setImgjson(json);
      }
      else
      {
         return bysj.getImgjson();
      }
      
     bysj.setProseurl("http://www.maybe123.top:888/image/face/"+param);
      //bysj.setProseurl("D:/image/face"+param);
      Thread th=new Thread(new ImageOutPut(file,"face/"+param));
      th.start();
      bysjImgurlBaseMapper.insertBysjImgurl(bysj);
      return json;
   }
   //添加文字识别结果
   public String addtextImg(MultipartFile file,String url)throws IOException{
      BysjImgurl bysj;
      //url+路径防止重复
      String json;
      String param=url+file.getOriginalFilename();
      bysj=getJson(param);
      if(bysj==null){
         bysj=new BysjImgurl();
         json=TextInfo.detect(file.getBytes());
      bysj.setImgjson(json);
      }
      else
      {
         return bysj.getImgjson();
      }

   bysj.setProseurl("http://www.maybe123.top:888/image/tex/"+param);
      //bysj.setProseurl("D:/image/tex"+param);
      Thread th=new Thread(new ImageOutPut(file,"tex/"+param));
      th.start();
      bysjImgurlBaseMapper.insertBysjImgurl(bysj);
      return json;
   }
   //查询图片json
   public BysjImgurl getJson(String imgurl){
      BysjImgurl bysjImgurl=new BysjImgurl();
      bysjImgurl.setProseurl(imgurl);
      return bysjImgurlBaseMapper.queryBysjImgurlLimit1(bysjImgurl);
   }
   //仅仅上传图片
   public String upImage(MultipartFile file,String parm){
      ImageOutPut im=new ImageOutPut(file,parm);
      Thread th=new Thread(im);
      th.start();
      return "http://www.maybe123.top:888/image/"+parm;

   }
}
