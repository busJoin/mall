package com.chang.mall.service.impl;

import com.chang.mall.mapper.PmsBrandMapper;
import com.chang.mall.model.PmsBrand;
import com.chang.mall.model.PmsBrandExample;
import com.chang.mall.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品品牌Service实现类
 * @create 2020-02-25 8:07
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Resource
    private PmsBrandMapper brandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }
}
