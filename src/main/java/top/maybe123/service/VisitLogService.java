package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.JlVisitlogMapper;
import top.maybe123.pojo.JlVisitlog;

import java.util.Iterator;
import java.util.List;

/**
 * @author pandd
 */
@Service
public class VisitLogService {
    @Autowired
    JlVisitlogMapper jlVisitlogMapper;
    public void addVisitRecord(List<JlVisitlog> list){
        for(Iterator<JlVisitlog> it=list.iterator();it.hasNext();){
            JlVisitlog jlVisitlog=it.next();
            jlVisitlogMapper.insertJlVisitlog(jlVisitlog);
        }
    }
}
