package com.ztq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HellowWorld {

    @GetMapping
    public String aa(){
        return "hello world";
    }



}
