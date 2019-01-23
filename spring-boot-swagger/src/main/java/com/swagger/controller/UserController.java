package com.swagger.controller;

import com.swagger.bean.Massage;
import com.swagger.bean.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

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
