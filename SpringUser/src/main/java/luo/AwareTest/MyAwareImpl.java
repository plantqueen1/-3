package luo.AwareTest;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 86185
 * 实现MyAware接口
 */
public class MyAwareImpl implements MyAware{
    private String beanInfo;
    public String getBeanInfo() {
        return beanInfo;
    }
    @Override
    public void setBeanInfo(String info) {
        this.beanInfo=info;
    }
}
