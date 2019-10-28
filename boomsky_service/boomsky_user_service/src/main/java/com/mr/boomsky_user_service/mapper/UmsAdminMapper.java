package com.mr.boomsky_user_service.mapper;

import com.mr.boomsky_user_service.model.UmsPermission;
import com.mr.boomsky_user_service.pojo.UmsAdmin;

import java.util.List;

public interface UmsAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    /*--------- 以下方法验证用户账号是否一致 -----------*/
    UmsAdmin findLoginUser(String username);

    List<UmsPermission> getPermissionList(Long adminId);
}