package com.mengnan.demo.oop.decorator;

import java.util.HashMap;
import java.util.Map;

public class CacheDataServiceImpl implements DataService {
    // 缓存
    private Map<String,String> cache;

    // 委托类,真正的撸铁健身类
    DataService delegate;

    public CacheDataServiceImpl(DataService dataService) {
        this.delegate = dataService;
        this.cache = new HashMap<>();
    }

    public String 撸铁健身(String name) {
        // 如果张三已经健身过就直接从缓存中返回健身完毕
        String cacheResult = cache.get(name);
        if (cacheResult == null) {
            cacheResult = delegate.撸铁健身(name);
            cache.put(name,cacheResult);
        }
        return cacheResult;
    }

}