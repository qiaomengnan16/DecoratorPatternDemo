package com.mengnan.demo.oop.decorator;

public class ApplicationMain {

    static DataService service = new DataServiceImpl();

    static DataService eatService = new EatDataServiceImpl(new DataServiceImpl());

    static DataService cacheService = new CacheDataServiceImpl(new EatDataServiceImpl(new DataServiceImpl()));

    public static void main(String [] args) {
        //service.撸铁健身("张三");
        //eatService.撸铁健身("张三");
        System.out.println(cacheService.撸铁健身("张三"));
        System.out.println(cacheService.撸铁健身("张三"));
        System.out.println(cacheService.撸铁健身("张三"));
    }




}
