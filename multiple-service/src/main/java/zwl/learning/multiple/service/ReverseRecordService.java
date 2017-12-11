package zwl.learning.multiple.service;

import zwl.learning.multiple.domain.ReverseRecord;

/**
 * @description
 * @author zhangwanli
 * @date 2017-11-07 下午2:02
 */
public interface ReverseRecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(ReverseRecord record);

    int insertSelective(ReverseRecord record);

    ReverseRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReverseRecord record);

    int updateByPrimaryKey(ReverseRecord record);
}
