package com.leyou.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author LiSheng
 * @date 2019/11/5 13:17
 */
@FeignClient("item-service")
public interface CategoryClient extends CategoryApi {
}
