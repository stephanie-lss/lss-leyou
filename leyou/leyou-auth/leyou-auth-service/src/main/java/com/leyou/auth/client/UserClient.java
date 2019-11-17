package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author LiSheng
 * @date 2019/11/16 21:53
 */
@FeignClient("user-service")
public interface UserClient extends UserApi {
}
