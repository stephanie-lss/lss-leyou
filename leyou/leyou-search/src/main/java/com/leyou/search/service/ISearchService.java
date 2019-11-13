package com.leyou.search.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Spu;
import com.leyou.search.pojo.Goods;
import com.leyou.search.pojo.SearchRequest;

import java.io.IOException;

/**
 * @author LiSheng
 * @date 2019/11/5 13:21
 */
public interface ISearchService {
    Goods buildGoods(Spu spu) throws IOException;

    PageResult<Goods> search(SearchRequest request);

    void save(Long id) throws IOException;

    void delete(Long id);
}
