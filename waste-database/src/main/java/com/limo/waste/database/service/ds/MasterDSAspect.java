package com.limo.waste.database.service.ds;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Aspect
@Component
public class MasterDSAspect {

    @Autowired
    DynamicDataSource dynamicDataSource;

    @Pointcut("@within(MasterDS)")
    public  void masterPointcut() {}

    @Around("masterPointcut()")
    public Object masterAround(ProceedingJoinPoint pjp) throws Throwable { //获取当前的数据源标识
        String key = Objects.requireNonNull(dynamicDataSource.determineCurrentLookupKey()).toString();
        if(null==key||!key.equals(DataSourceConstant.DS_KEY_MASTER)){ //切换数据源
            DynamicDataSourceContextHolder.setContextKey(DataSourceConstant.DS_KEY_MASTER);
        }
        Object object = pjp.proceed();//恢复
        DynamicDataSourceContextHolder.setContextKey(key);
        return object;
    }
}
