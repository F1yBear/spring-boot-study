package com.fexo.controller;

import com.fexo.bean.Massage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("mybatis")
public class Hello {

    @GetMapping("hello")
    public Massage first() {
        Massage massage = new Massage();
        massage.setStatus("success");
        massage.setCode(200);
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "000");
        massage.setContent(map);
        return massage;
    }
}
