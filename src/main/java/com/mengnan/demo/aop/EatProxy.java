package com.mengnan.demo.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EatProxy implements InvocationHandler {
    DataService delegate;

    public EatProxy(DataService delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(args[0] + "正在吃饭中");
        return method.invoke(delegate,args);
    }

}
