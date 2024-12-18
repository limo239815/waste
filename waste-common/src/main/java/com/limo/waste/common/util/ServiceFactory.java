package com.limo.waste.common.util;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author
 * @Date
 * @Description: bean工厂
 */
@Component
public class ServiceFactory {

    private final ApplicationContext applicationContext;

    public ServiceFactory(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public <T> T getBean(Class<T> clazz, String qualifier){
        return applicationContext.getBean(qualifier, clazz);
    }
}
