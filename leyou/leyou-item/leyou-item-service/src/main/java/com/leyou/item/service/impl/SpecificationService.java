package com.leyou.item.service.impl;

import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import com.leyou.item.service.ISpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/10/31 17:34
 */
@Service
public class SpecificationService implements ISpecificationService {
    @Autowired
    private SpecGroupMapper groupMapper;

    @Autowired
    private SpecParamMapper paramMapper;

    @Override
    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup record = new SpecGroup();
        record.setCid(cid);
        return this.groupMapper.select(record);
    }

    /**
     * 根据条件查询规格参数
     * @param gid
     * @return
     */
    @Override
    public List<SpecParam> queryParams(Long gid) {
        SpecParam record = new SpecParam();
        record.setGroupId(gid);
        return this.paramMapper.select(record);
    }
}
