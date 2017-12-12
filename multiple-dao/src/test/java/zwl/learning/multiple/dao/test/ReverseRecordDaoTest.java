package zwl.learning.multiple.dao.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import zwl.learning.multiple.domain.entity.ReverseRecordEntity;

import java.io.Reader;

/**
 * @author zhangwanli
 * @description
 * @date 2017-12-11 下午5:48
 */
public class ReverseRecordDaoTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    @Before
    public void before() {
        try {
            reader = Resources.getResourceAsReader("sqlmap/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void selectByPrimaryKey() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            ReverseRecordEntity entity = (ReverseRecordEntity) session.selectOne(
                    "zwl.learning.multiple.dao.ReverseRecordDao.selectByPrimaryKey", 1);
            if(entity!=null){
                String s = "tradeNo："+entity.getTradeNo();
                System.out.println(s);
            }
        } finally {
            session.close();
        }
    }

}
