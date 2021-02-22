package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * 页面管理dao
 */
public interface PageTableDao {

    /**
     * 统计页面总数
     * @param jsonObject
     * @return
     */
    Integer countPermission(JSONObject jsonObject);

    /**
     * 分页查询页面
     * @param jsonObject
     * @return
     */
    List<JSONObject> listPermission(JSONObject jsonObject);

    /**
     * 查询是否有重复Code
     * @param jsonObject
     * @return
     */
    List<JSONObject> selPermissionByCode(JSONObject jsonObject);

    /**
     * 添加页面
     * @param jsonObject
     * @return
     */
    int addPermissions(JSONObject jsonObject);

    /**
     * 获取最大id值
     * @return
     */
    int getMaxId();

    /**
     * 删除页面
     * @param jsonObject
     * @return
     */
    int delPermissions(JSONObject jsonObject);
}
