package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/10/26 13:51
 */
public interface CategoryMapper extends tk.mybatis.mapper.common.Mapper<Category> {

    @Select("select * from tb_category where id in(select category_id from tb_category_brand where brand_id = #{bid})")
    List<Category> queryByBrandId(Long bid);
}
