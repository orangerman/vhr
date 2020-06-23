package com.javafan.vhr.controller;

import com.javafan.vhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JavaFan
 * @create 2020-06-21 3:24 下午
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登陆，请登录");
    }
}
