package top.maybe123.controller;

import com.google.gson.Gson;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.BysjAuditing;
import top.maybe123.pojo.BysjAuthor;
import top.maybe123.pojo.BysjProse;
import top.maybe123.pojo.BysjUser;
import top.maybe123.service.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuditingController {
@Autowired
    AuditingService auditingService;
@Autowired
    AuthorServicce authorServicce;
@Autowired
    CommentService commentService;
@Autowired
    ProseService proseService;
@Autowired
    UserService userService;
    //得到审核信息
    @RequestMapping(value = "getAuditingAll.action")
    public @ResponseBody
    List<BysjAuditing>  getAuditingAll(){
        return auditingService.getAuditings();
    }
    //更新审核状态
    @RequestMapping(value = "upAuditing.action",method = RequestMethod.POST)
    public @ResponseBody String upAuditing(@Param("bysjAuditing") String bysjAuditing)
    {
        Gson gson=new Gson();
        BysjAuthor bysjAuthor;
        BysjProse bysjProse;
        BysjUser bysjUser;

      //更新审核表状态
        BysjAuditing bysjAuditing1=gson.fromJson(bysjAuditing,BysjAuditing.class);
       auditingService.upInfo(bysjAuditing1);

System.out.println(bysjAuditing1.toString());
        switch (bysjAuditing1.getAud_classify()){
            case 1:
                bysjAuthor=gson.fromJson(bysjAuditing1.getAud_content(),BysjAuthor.class);
                List<BysjAuthor> ll=new ArrayList<>();
                ll.add(bysjAuthor);
                authorServicce.updateAuthor(ll);break;
            case 2:
                bysjProse=gson.fromJson(bysjAuditing1.getAud_content(),BysjProse.class);
                proseService.updateProse(bysjProse);break;
            case 3:
                bysjUser=gson.fromJson(bysjAuditing1.getAud_content(),BysjUser.class);
                userService.updateUser(bysjUser);break;
                default:
                    return "当前审核分类不存在";


        }
        return "成功！";
    }
}
