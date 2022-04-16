package com.lang.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 浪
 * @date 11/4/2022 上午10:55
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String getLoginData(@RequestBody JSONObject jsonObject){
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        System.out.println(username);
        System.out.println(password);
        return "用户名："+username+"密码："+password;
    }
    @RequestMapping("/test")
    public String test01(){
        return "lang";
    }
}
