package top.maybe123.dao.base;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.maybe123.pojo.BysjComment;
/**
*  @author author
*/
public interface BysjCommentBaseMapper {

    int insertBysjComment(BysjComment object);

    int updateBysjComment(BysjComment object);

    int update(BysjComment.UpdateBuilder object);

    List<BysjComment> queryBysjComment(BysjComment object);

    BysjComment queryBysjCommentLimit1(BysjComment object);

}