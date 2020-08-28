package com.mengnan.demo.oop.decorator;

public class EatDataServiceImpl implements DataService {
    // 委托类,真正的撸铁健身类
    DataService delegate;

    public EatDataServiceImpl(DataService dataService) {
        this.delegate = dataService;
    }

    public String 撸铁健身(String name) {
        System.out.println(name + "正在吃饭中");
        return delegate.撸铁健身(name);
    }
}