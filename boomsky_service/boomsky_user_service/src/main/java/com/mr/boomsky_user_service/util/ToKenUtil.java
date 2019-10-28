package com.mr.boomsky_user_service.util;

import com.alibaba.druid.util.StringUtils;
//import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class ToKenUtil {

    /**
     * 随机生成token令牌
     * @return
     */
    public static String createToKen(HttpServletRequest request){
        String checkCode = ValidateUtil.createCheckCode();
        Long time = new Date().getTime();

        //生成随机令牌
        String token = MD5Util.string2MD5(checkCode + time);

        //将令牌存到session中
        request.getSession().setAttribute(Const.MSG_TOKEN,token);
        return token;
    }

    /**
     * 随机生成token令牌
     * @return
     */
    public static String createToKen(){
        String checkCode = ValidateUtil.createCheckCode();
        Long time = new Date().getTime();

        //生成随机令牌
        String token = MD5Util.string2MD5(checkCode + time);

        return token;
    }

    /**
     *  验证 token 是否一致
     *  阻止表单提交
     * @param token
     * @param request
     * @return
     */
    public static Boolean verificationToKen(String token,HttpServletRequest request){

        String sessionToKen = (String)request.getSession().getAttribute(Const.MSG_TOKEN);

        //判断session的token是否为空,为空返回false
        if(StringUtils.isEmpty(sessionToKen)){
            return false;
        }
        //判断前台传入的token是否位空,为空返回false
        if(StringUtils.isEmpty(token)){
            return false;
        }

        //判断前台与session中的token是否一致,不一致返回false
        if(!token.equals(sessionToKen)){
            return false;
        }

        //以上条件都不符合,则验证成功,将session中的令牌清除
        request.getSession().removeAttribute(Const.MSG_TOKEN);
        return true;
    }

    /**
     * 验证手机验证码是否一致
     * @param code
     * @param request
     * @return
     */
    public static Boolean verificationCode(String code,HttpServletRequest request){
        //获取session中的验证码
        String messCode = (String)request.getSession().getAttribute(Const.MSG_CODE);

        //判断session中的验证码是否为空,为空返回false
        if(StringUtils.isEmpty(messCode)){
            return false;
        }

        //判断前台传入的验证码是否为空,为空返回false
        if(StringUtils.isEmpty(code)){
            return false;
        }

        //判断前台传入的验证码是否与session中的验证码一致,不一致返回false
        if(!code.equals(messCode)){
            return false;
        }

        return true;
    }

}
