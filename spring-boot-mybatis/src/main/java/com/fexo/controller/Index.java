package com.fexo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class Index {


  @RequestMapping("")
    public  String index(){
        return "/swagger-ui.html";
    }
}
