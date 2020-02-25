package com.chang.mall.service;

import com.chang.mall.model.UmsAdmin;
import com.chang.mall.dto.UmsAdminParam;

/**
 * @create 2020-02-24 21:25
 * 后台管理员Service
 */
public interface UmsAdminService {
    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);
}
