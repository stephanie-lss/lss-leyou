package com.leyou.user.service;

import com.leyou.pojo.User;

/**
 * @author LiSheng
 * @date 2019/11/13 23:06
 */
public interface IUserService {
    Boolean checkUser(String data, Integer type);

    void sendVerifyCode(String phone);

    void register(User user, String code);
}
