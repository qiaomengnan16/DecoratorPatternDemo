package com.mengnan.demo.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    private DataBiz dataBiz;

    @GetMapping("/hello")
    public List<String> getList() {
        return dataBiz.getList();
    }

}
