package com.mengnan.demo.springaop;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author qiaomengnan
 * @ClassName: DataBiz
 * @Description:
 * @date 2020-08-29
 */
@Service
public class DataBiz {
    @Cache
    public List<String> getList() {
        return Arrays.asList("1","2","3");
    }
}
