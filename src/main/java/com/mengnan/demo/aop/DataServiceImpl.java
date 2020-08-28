package com.mengnan.demo.aop;


public class DataServiceImpl implements DataService {
    public String 撸铁健身(String name) {
        System.out.println(name + "正在健身中");
        return "健身完毕";
    }
}
