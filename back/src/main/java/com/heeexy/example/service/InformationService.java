package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

public interface InformationService {
    /**
     * 查询文章列表
     * @param jsonObject
     * @return
     */
    JSONObject findAll(JSONObject jsonObject);
}
