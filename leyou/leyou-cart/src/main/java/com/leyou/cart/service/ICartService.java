package com.leyou.cart.service;

import com.leyou.cart.pojo.Cart;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/11/30 12:53
 */
public interface ICartService {
    void addCart(Cart cart);

    List<Cart> queryCarts();

    void updateNum(Long skuId, Integer num);

    void deleteCart(String skuId);
}
