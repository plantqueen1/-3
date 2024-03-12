package luo.AwareTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 86185
 */
public class ExAware implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //判断bean是否实现Aware

            //判断是否实现MyAware
            if (bean instanceof MyAware) {
                //进行回调
                ((MyAware) bean).setBeanInfo("感知到该类！");
            }

        return bean;
    }
}
