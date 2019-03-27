package top.maybe123.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.maybe123.pojo.BysjUser;
/**
*  @author author
*/
public interface BysjUserBaseMapper {

    int insertBysjUser(BysjUser object);

    int updateBysjUser(BysjUser object);

    int update(BysjUser.UpdateBuilder object);

    List<BysjUser> queryBysjUser(BysjUser object);

    BysjUser queryBysjUserLimit1(BysjUser object);

}