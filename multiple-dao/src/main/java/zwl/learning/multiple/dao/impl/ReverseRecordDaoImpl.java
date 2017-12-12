package zwl.learning.multiple.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import zwl.learning.multiple.dao.ReverseRecordDao;
import zwl.learning.multiple.domain.entity.ReverseRecordEntity;

import java.util.List;
import java.util.Map;

/**
 * @author zhangwanli
 * @description
 * @date 2017-12-12 上午11:41
 */
public class ReverseRecordDaoImpl extends SqlSessionDaoSupport implements ReverseRecordDao {

    private static final String NAME_SPACE = "";

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ReverseRecordEntity record) {
        return 0;
    }

    @Override
    public int insertSelective(ReverseRecordEntity record) {
        return 0;
    }

    @Override
    public ReverseRecordEntity selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<ReverseRecordEntity> selectByMultiple(Map<Integer, Integer> m) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ReverseRecordEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ReverseRecordEntity record) {
        return 0;
    }
}
