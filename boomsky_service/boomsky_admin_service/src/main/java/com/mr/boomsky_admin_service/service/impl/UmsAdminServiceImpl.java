package com.mr.boomsky_admin_service.service.impl;

import com.mr.boomsky_admin_service.service.UmsAdminService;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {


    @Override
    public String login(String username, String password) {
        String token = "aaa";

        //密码需要客户端加密后传递
        System.out.println("根据用户名查询信息");
        return token;
    }


}
