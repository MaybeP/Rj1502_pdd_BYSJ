package top.maybe123.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.maybe123.pojo.BysjAuditing;
/**
*  @author 
*/
public interface BysjAuditingBaseMapper {

    int insertBysjAuditing(BysjAuditing object);

    int updateBysjAuditing(BysjAuditing object);

    int update(BysjAuditing.UpdateBuilder object);

    List<BysjAuditing> queryBysjAuditing(BysjAuditing object);

    BysjAuditing queryBysjAuditingLimit1(BysjAuditing object);

}