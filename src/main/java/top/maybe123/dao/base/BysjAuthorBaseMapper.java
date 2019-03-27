package top.maybe123.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.maybe123.pojo.BysjAuthor;
/**
*  @author author
*/
public interface BysjAuthorBaseMapper {

    int insertBysjAuthor(BysjAuthor object);

    int updateBysjAuthor(BysjAuthor object);

    int update(BysjAuthor.UpdateBuilder object);

    List<BysjAuthor> queryBysjAuthor(BysjAuthor object);

    BysjAuthor queryBysjAuthorLimit1(BysjAuthor object);

}