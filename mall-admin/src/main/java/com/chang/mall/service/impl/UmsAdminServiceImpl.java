package com.chang.mall.service.impl;

import com.chang.mall.mapper.UmsAdminMapper;
import com.chang.mall.model.UmsAdmin;
import com.chang.mall.model.UmsAdminExample;
import com.chang.mall.dto.UmsAdminParam;
import com.chang.mall.service.UmsAdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @create 2020-02-24 21:26
 * UmsAdminService实现类
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    /*@Autowired
    private PasswordEncoder passwordEncoder;*/
    @Autowired
    private UmsAdminMapper adminMapper;

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam,umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size()>0){
            return null;
        }
        //将密码进行加密操作
//        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
//        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }
}
