package zwl.learning.multiple.dao;

import zwl.learning.multiple.domain.entity.ReverseRecordEntity;

import java.util.List;
import java.util.Map;

public interface ReverseRecordDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ReverseRecordEntity record);

    int insertSelective(ReverseRecordEntity record);

    ReverseRecordEntity selectByPrimaryKey(Integer id);

    /**
     *
     */
    List<ReverseRecordEntity> selectByMultiple(Map<Integer,Integer> m);

    int updateByPrimaryKeySelective(ReverseRecordEntity record);

    int updateByPrimaryKey(ReverseRecordEntity record);
}