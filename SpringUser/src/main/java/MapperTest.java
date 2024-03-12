import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MapperTest {
        public static SqlSessionFactory sessionFactory;
    static {
        try {
            InputStream inputStream= Resources.getResourceAsStream("MybatisConFig.xml");
            sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession session(){
        return sessionFactory.openSession(true);
    }
}
