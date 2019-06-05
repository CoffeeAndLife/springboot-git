package com.qianfeng.springbootgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huangguizhao
 */
@Controller
@RequestMapping("our")
public class OurController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
