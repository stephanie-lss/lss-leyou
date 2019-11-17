package com.leyou.user.api;

import com.leyou.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LiSheng
 * @date 2019/11/16 21:51
 */
public interface UserApi {
    @GetMapping("query")
    User queryUser(@RequestParam("username") String username, @RequestParam("password") String password);

}
