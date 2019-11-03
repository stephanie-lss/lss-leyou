package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.SpuDetail;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/10/31 21:23
 */
public interface IGoodsService {
    PageResult<SpuBo> querySpuByPage(String key, Boolean saleable, Integer page, Integer rows);

    /**
     * 新增商品
     * @param spuBo
     */
    void saveGoods(SpuBo spuBo);

    /**
     * 根据spuId查询spuDetail
     * @param spuId
     * @return
     */
    SpuDetail querySpuDetailBySpuId(Long spuId);

    /**
     * 根据spuId查询Skus
     * @param spuId
     * @return
     */
    List<Sku> querySkusBySpuId(Long spuId);

    /**
     * 编辑商品
     * @param spuBo
     */
    void updateGoods(SpuBo spuBo);
}
