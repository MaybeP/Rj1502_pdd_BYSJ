package top.maybe123.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.maybe123.pojo.BysjImgurl;
/**
*  @author author
*/
public interface BysjImgurlBaseMapper {

    int insertBysjImgurl(BysjImgurl object);

    int updateBysjImgurl(BysjImgurl object);

    int update(BysjImgurl.UpdateBuilder object);

    List<BysjImgurl> queryBysjImgurl(BysjImgurl object);

    BysjImgurl queryBysjImgurlLimit1(BysjImgurl object);

}