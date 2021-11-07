package com.wtf.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qingmei
 * @date 2020-12-04
 * @desc
 */
@Controller
public class TestController {
    public final static Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("test1")
    public String hello() {
        log.info("hello------------------");
        return "index";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String test() {
        log.info("hello111------------------");
        return "hello world!";
    }

}
