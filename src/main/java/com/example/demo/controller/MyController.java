package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.util.StringUtil;

@RestController
public class MyController {
    @GetMapping(value = "/reverse/{str}")
    public String getHello(@PathVariable("str") String str) {
    	String message = StringUtil.reverseString(str);
    	return message;
    }
}