package com.mr.boomsky_user_service.service.impl;

import com.mr.boomsky_user_service.mapper.UmsAdminMapper;
import com.mr.boomsky_user_service.model.UmsPermission;
import com.mr.boomsky_user_service.pojo.UmsAdmin;
import com.mr.boomsky_user_service.service.UmsAdminService;
import com.mr.boomsky_user_service.util.Const;
import com.mr.boomsky_user_service.util.ToKenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的token
     */
    @Override
    public String login(String username,String password,HttpServletRequest request) {
        String token=null;

        // 根据用户名查询该账户信息
        UmsAdmin newUmsAdmin = umsAdminMapper.findLoginUser(username);
        // 账户不存在
        if(newUmsAdmin == null){
            return token;
        }
        // 密码不正确
        // String newPassWord = MD5Util.string2MD5(umsAdmin.getPassword());
        if(!passwordEncoder.matches(password,newUmsAdmin.getPassword())){
            return token;
        }
        // 所有条件都符合
        request.getSession().setAttribute(Const.MSG_USER,newUmsAdmin.getUsername());
        token = ToKenUtil.createToKen();

        return token;
    }

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return umsAdminMapper.getPermissionList(adminId);
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return umsAdminMapper.findLoginUser(username);
    }

}
