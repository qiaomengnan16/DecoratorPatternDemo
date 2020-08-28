package com.mengnan.demo.oop;

public class DataModifyCodeDemo {

    static class DataService {

        public void 撸铁健身() {
            System.out.println("开始健身");
        }

    }

    // 直接改 DataService 类源代码实现前置需求
    static class DataService2 {
        public void 撸铁健身() {
            System.out.println("开始吃饭");
            System.out.println("开始健身");
        }
    }


    public static void main(String[] args) {
        DataService dataService = new DataService();
        dataService.撸铁健身();
        DataService2 dataService2 = new DataService2();
        dataService2.撸铁健身();
    }


}
