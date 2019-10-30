package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/10/26 23:01
 */
public interface ICategoryService {
    /**
     * 根据父节点查询子节点
     * @param pid
     * @return
     */
    public List<Category> queryCategoriesByPid(Long pid);

    List<Category> queryByBrandId(Long bid);
}
