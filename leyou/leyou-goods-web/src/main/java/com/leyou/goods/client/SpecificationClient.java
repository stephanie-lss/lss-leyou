package com.leyou.goods.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author LiSheng
 * @date 2019/11/5 13:18
 */
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
