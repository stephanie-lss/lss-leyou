package com.leyou.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.leyou.item.pojo.Spu;
import com.leyou.search.pojo.Goods;

import java.io.IOException;

/**
 * @author LiSheng
 * @date 2019/11/5 13:21
 */
public interface ISearchService {
    Goods buildGoods(Spu spu) throws IOException;
}
