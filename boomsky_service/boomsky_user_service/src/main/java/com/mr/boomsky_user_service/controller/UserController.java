package com.mr.boomsky_user_service.controller;

import com.mr.boomsky_user_service.pojo.UmsAdmin;
import com.mr.boomsky_user_service.service.UmsAdminService;
import com.mr.boomsky_user_service.util.CommonResult;
import com.mr.boomsky_user_service.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class UserController {

    @Autowired
    private UmsAdminService adminSer;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody UmsAdmin umsAdmin, HttpServletRequest request, BindingResult result){
        System.out.println("用户登陆成功!");
        String token = adminSer.login(umsAdmin.getUsername(),umsAdmin.getPassword(),request);
        if(token == null){
            return CommonResult.validateFailed("账户或密码错误!");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        return CommonResult.success(tokenMap);
    }

    @ResponseBody
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public CommonResult getAdminInfo(HttpServletRequest request){
        String username = "admin";
        UmsAdmin umsAdmin = adminSer.getAdminByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", umsAdmin.getUsername());
        data.put("roles", new String[]{"TEST"});
        data.put("icon", umsAdmin.getIcon());
        return CommonResult.success(data);
    }

}
