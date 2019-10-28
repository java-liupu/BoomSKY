package com.mr.boomsky_user_service.service;

import com.mr.boomsky_user_service.model.UmsPermission;
import com.mr.boomsky_user_service.pojo.UmsAdmin;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UmsAdminService {

    String login(String username, String password,HttpServletRequest request);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

    UmsAdmin getAdminByUsername(String username);
}
