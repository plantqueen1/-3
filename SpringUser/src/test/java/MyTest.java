import luo.AwareTest.ExAware;
import luo.AwareTest.MyAware;
import luo.AwareTest.MyAwareImpl;
import luo.dao.User;
import luo.pojo.MapperUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
       context.getBeanDefinitionNames();
        MapperUser mapperUser = context.getBean("MapperUser", MapperUser.class);
        for (User user : mapperUser.getSelect()) {
            System.out.println(user);
        }
        MyAwareImpl bean = context.getBean("MyAwareImpl",MyAwareImpl.class);
        System.out.println(bean.getBeanInfo());
    }
}
