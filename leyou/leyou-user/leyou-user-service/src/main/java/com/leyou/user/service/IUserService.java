package com.leyou.user.service;

/**
 * @author LiSheng
 * @date 2019/11/13 23:06
 */
public interface IUserService {
    Boolean checkUser(String data, Integer type);

    void sendVerifyCode(String phone);
}
