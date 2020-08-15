package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @copyright (C), 2017-2020,jASON
 * @author: 19565
 * @date: 2020/8/14 17:11
 * @fileName: ControllerDemo
 * @description: controller
 */
@Controller
public class ControllerDemo {
    @RequestMapping(value = {"/index","/","/test"})
    public String helloIndex(Map<String, Object> model){
        return "index";
    }
    @RequestMapping("/VueIndex")
    public String helloVue(Map<String, Object> model) {
        return "vueIndex";
    }
}
