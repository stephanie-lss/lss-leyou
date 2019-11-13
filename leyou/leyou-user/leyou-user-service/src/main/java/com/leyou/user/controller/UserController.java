package com.leyou.user.controller;

import com.leyou.user.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LiSheng
 * @date 2019/11/13 23:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册校验
     * @param data
     * @param type 1表示校验用户名 2表示校验电话号码
     * @return
     */
    @GetMapping("/check/{data}/{type}")
    public ResponseEntity<Boolean> checkUser(@PathVariable("data") String data, @PathVariable("type") Integer type) {
        Boolean flag = this.userService.checkUser(data, type);
        if (flag == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(flag);
    }
}
