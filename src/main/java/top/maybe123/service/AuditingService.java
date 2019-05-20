package top.maybe123.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maybe123.dao.base.BysjAuditingBaseMapper;
import top.maybe123.pojo.BysjAuditing;

import java.util.List;

/*管理员信息审核
*
*
* @author pdd
*
*
 */
 @Service
public class AuditingService {
  @Autowired
  BysjAuditingBaseMapper bysjAuditingBaseMapper;

  //插入审核信息
 public String insInfo(BysjAuditing bysjAuditing){
  bysjAuditingBaseMapper.insertBysjAuditing(bysjAuditing);
  return "success";
 }

 //更新审核状态
 public String upInfo(BysjAuditing bysjAuditing){
  bysjAuditingBaseMapper.updateBysjAuditing(bysjAuditing);
  return "success";
 }

 //获取审核信息
 public List<BysjAuditing> getAuditings(){
  BysjAuditing.QueryBuilder queryBuilder=BysjAuditing.QueryBuild();
  queryBuilder.aud_result(1);
  return bysjAuditingBaseMapper.queryBysjAuditing(queryBuilder);
 }

}
