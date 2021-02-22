package com.heeexy.example.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

public class SessionUtils {

    public static long getUserId(){
        Session session = SecurityUtils.getSubject().getSession();
        JSONObject userInfo = (JSONObject) session.getAttribute("userInfo");
        return userInfo.getLongValue("userId");
    }

}
