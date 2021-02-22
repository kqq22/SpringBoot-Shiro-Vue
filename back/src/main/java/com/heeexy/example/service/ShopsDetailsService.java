package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;

/**
 * 商家详情业务逻辑接口类
 */
public interface ShopsDetailsService {
    /**
     * 根据userId查询商家详情
     * @param jsonObject
     * @return
     */
    JSONObject findShopsDetails(JSONObject jsonObject);

    /**
     * 修改商家详情
     * @param jsonObject
     * @return
     */
    JSONObject updateShopsDetails(JSONObject jsonObject);
}
