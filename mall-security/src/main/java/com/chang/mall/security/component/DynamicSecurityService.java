package com.chang.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @create 2020-02-25 8:02
 * 动态权限相关业务类
 */
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute>  loadDataSource();
}
