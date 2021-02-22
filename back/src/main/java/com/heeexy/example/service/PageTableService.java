package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 页面管理接口类
 */
public interface PageTableService {
    /**
     * 分页查询页面管理
     * @param jsonObject
     * @return
     */
    JSONObject findPermission(JSONObject jsonObject);

    /**
     * 添加页面
     * @param jsonObject
     * @return
     */
    JSONObject addPermissions(JSONObject jsonObject);

    /**
     * 删除页面
     * @param jsonObject
     * @return
     */
    JSONObject delPermissions(JSONObject jsonObject);
}
