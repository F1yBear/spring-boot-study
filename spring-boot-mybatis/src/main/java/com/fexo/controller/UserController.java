package com.fexo.controller;

import com.fexo.bean.Massage;
import com.fexo.bean.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关的api
 * @author wangfeixiong
 */
@Api("用户相关的api")
@RestController
@RequestMapping("user/")
public class UserController {

    @PostMapping("add")
    public Massage first(@RequestBody User user) {
        Massage massage = new Massage();
        massage.setStatus("success");
        massage.setCode(200);
        massage.setContent(user);
        return massage;
    }
}
