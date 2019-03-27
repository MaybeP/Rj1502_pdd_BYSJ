package top.maybe123.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.maybe123.pojo.BysjProse;
/**
*  @author author
*/
public interface BysjProseBaseMapper {

    int insertBysjProse(BysjProse object);

    int updateBysjProse(BysjProse object);

    int update(BysjProse.UpdateBuilder object);

    List<BysjProse> queryBysjProse(BysjProse object);

    BysjProse queryBysjProseLimit1(BysjProse object);

}