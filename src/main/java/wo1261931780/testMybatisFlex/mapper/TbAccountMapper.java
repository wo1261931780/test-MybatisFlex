package wo1261931780.testMybatisFlex.mapper;

import java.util.List;

import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wo1261931780.testMybatisFlex.domain.TbAccount;

/**
*Created by Intellij IDEA.
*Project:test-MybatisFlex
*Package:wo1261931780.testMybatisFlex.mapper
*@author liujiajun_junw
*@Date 2023-11-21-00  星期日
*@Description 
*/

@Mapper
public interface TbAccountMapper extends BaseMapper<TbAccount> {
    int updateBatch(List<TbAccount> list);

    int batchInsert(@Param("list") List<TbAccount> list);

    int insertOrUpdate(TbAccount record);

    int insertOrUpdateSelective(TbAccount record);


}
