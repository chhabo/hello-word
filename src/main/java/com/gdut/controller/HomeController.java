package com.gdut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chb on 2018/7/6.
 */

@Controller
public class HomeController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayhello(){
        return "hello";
    }


}
