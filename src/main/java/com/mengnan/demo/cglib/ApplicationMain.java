package com.mengnan.demo.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ApplicationMain {
    static DataService service = new DataService();

    public static class LogInterceptor implements MethodInterceptor {
        private DataService delegate;

        public LogInterceptor(DataService delegate) {
            this.delegate = delegate;
        }

        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println(method.getName() + "执行了, 参数是：" + Arrays.asList(objects));
            Object returnValue = method.invoke(delegate, objects);
            System.out.println(method.getName() + "返回结果了，结果是：" + returnValue);
            return returnValue;
        }
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(DataService.class);
        enhancer.setCallback(new LogInterceptor(service));

        DataService enhancerService = (DataService)enhancer.create();
        enhancerService.撸铁健身("张三");
    }
}
