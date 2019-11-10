package com.leyou.goods.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author LiSheng
 * @date 2019/11/5 12:59
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {
}
