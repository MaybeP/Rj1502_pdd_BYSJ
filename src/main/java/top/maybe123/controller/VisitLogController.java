package top.maybe123.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maybe123.pojo.JlVisitlog;
import top.maybe123.service.VisitLogService;
import java.util.ArrayList;
import java.util.List;
@Controller
public class VisitLogController {
    @Autowired
    VisitLogService visitLogService;
    @RequestMapping(value = "addJLLogInfo.action")
    public @ResponseBody String addJLLogInfo(@Param("loginfo")String logInfo){
        Gson gson=new Gson();
        List<JlVisitlog> jlVisitlogs=gson.fromJson(logInfo, new TypeToken<ArrayList<JlVisitlog>>(){}.getType());
        visitLogService.addVisitRecord(jlVisitlogs);
        return "success!";
    }
}
