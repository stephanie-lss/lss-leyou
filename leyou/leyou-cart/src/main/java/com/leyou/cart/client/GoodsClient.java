package com.leyou.cart.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author LiSheng
 * @date 2019/11/30 13:24
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {
}
