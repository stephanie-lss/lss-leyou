package com.leyou.item.service;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/10/31 17:31
 */
public interface ISpecificationService {

    /**
     * 根据分类ID查询参数组
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupsByCid(Long cid);

    /**
     * 根据条件查询规格参数
     * @param gid
     * @return
     */
    List<SpecParam> queryParams(Long gid);
}
