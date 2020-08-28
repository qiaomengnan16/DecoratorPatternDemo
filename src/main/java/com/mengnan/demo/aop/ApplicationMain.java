package com.mengnan.demo.aop;

import java.lang.reflect.Proxy;

public class ApplicationMain {

    public static void main(String[] args) {
        DataService service = new DataServiceImpl();
        DataService dataService = (DataService)Proxy.newProxyInstance(service.getClass().getClassLoader(),new Class[]{DataService.class}, new EatProxy(service));
        System.out.println(dataService.撸铁健身("张三"));
    }

}
