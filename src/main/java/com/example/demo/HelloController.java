package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2018/12/6
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "SpringBoot, Hello~ 1";
    }
}
