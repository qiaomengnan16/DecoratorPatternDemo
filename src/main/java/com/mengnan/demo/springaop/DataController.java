package com.mengnan.demo.springaop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {


    @GetMapping("/hello")
    @Cache
    public List<String> getList() {
        return Arrays.asList("1","2","3");
    }

}
