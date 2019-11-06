package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author LiSheng
 * @date 2019/11/6 12:29
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
