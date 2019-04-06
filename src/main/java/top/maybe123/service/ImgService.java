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

@Service
public class ImgService {
   @Autowired
   BysjImgurlBaseMapper bysjImgurlBaseMapper;
   //添加面部识别结果
   public void addfaceImg(MultipartFile file,String url) throws IOException {
      BysjImgurl bysj;
      String param=url+file.getOriginalFilename();
      bysj=getJson(param);
      if(bysj==null){
         bysj=new BysjImgurl();
         bysj.setImgjson(FaceInfo.detect(file.getBytes()));
      }
      else
      {
         return;
      }
      
      bysj.setProseurl("www.maybe123.top:888/image/face/"+param);
      Thread th=new Thread(new ImageOutPut(file,"face/"+param));
      th.start();
      bysjImgurlBaseMapper.insertBysjImgurl(bysj);
   }
   //添加文字识别结果
   public void addtextImg(MultipartFile file,String url)throws IOException{
      BysjImgurl bysj;
      //url+路径防止重复
      String param=url+file.getOriginalFilename();
      bysj=getJson(param);
      if(bysj==null){
         bysj=new BysjImgurl();
      bysj.setImgjson(TextInfo.detect(file.getBytes()));
      }
      else
      {
         return;
      }
      bysj.setProseurl("www.maybe123.top:888/image/text/"+param);
      Thread th=new Thread(new ImageOutPut(file,"text/"+param));
      th.start();
      bysjImgurlBaseMapper.insertBysjImgurl(bysj);
   }
   //查询图片json
   public BysjImgurl getJson(String imgurl){
      BysjImgurl bysjImgurl=new BysjImgurl();
      bysjImgurl.setProseurl(imgurl);
      return bysjImgurlBaseMapper.queryBysjImgurlLimit1(bysjImgurl);
   }
   //仅仅上传图片
   public void upImage(MultipartFile file,String parm){
      ImageOutPut im=new ImageOutPut(file,parm);
      Thread th=new Thread(im);
      th.start();
   }
}
