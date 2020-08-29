package com.mengnan.demo.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Configuration
public class CacheAspect {


    Map<String,Object> cache = new HashMap<>();

    @Around("@annotation(Cache)")
    public Object cache(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        String methodName = signature.getName();
        Object cacheValue = cache.get(methodName);
        if(cacheValue != null) {
            System.out.println("从缓存中返回");
            return cacheValue;
        } else {
            System.out.println("从方法中返回");
            cacheValue = point.proceed();
            cache.put(methodName,cacheValue);
            return cacheValue;
        }
    }


}
