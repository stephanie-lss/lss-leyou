package com.leyou.user.service.impl;

import com.leyou.commom.utils.NumberUtils;
import com.leyou.pojo.User;
import com.leyou.user.mapper.UserMapper;
import com.leyou.user.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author LiSheng
 * @date 2019/11/13 23:06
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    private static final String KEY_PREFIX = "user:verify";

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 校验数据是否可用
     *
     * @param data
     * @param type
     * @return
     */
    @Override
    public Boolean checkUser(String data, Integer type) {
        User record = new User();
        if (type == 1) {
            record.setUsername(data);
        } else if (type == 2) {
            record.setPhone(data);
        } else {
            return null;
        }
        return this.userMapper.selectCount(record) == 0;
    }

    @Override
    public void sendVerifyCode(String phone) {
        if (StringUtils.isBlank(phone)) {
            return;
        }
        //生成验证码
        String code = NumberUtils.generateCode(6);
        //发送消息到rabbitMQ
        Map<String, String> msg = new HashMap<>();
        msg.put("phone", phone);
        msg.put("code", code);
        this.amqpTemplate.convertAndSend("LEYOU.SMS.EXCHANGE", "verifycode.sms", msg);
        //把验证码保存到redis中
        this.redisTemplate.opsForValue().set(KEY_PREFIX + phone, code, 5, TimeUnit.MINUTES);
    }
}
