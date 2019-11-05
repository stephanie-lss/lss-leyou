package com.leyou.item.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/10/26 13:55
 */
@RequestMapping("category")
public interface CategoryApi {

    @GetMapping
    List<String> queryNamesByIds(@RequestParam("ids") List<Long> ids);
}