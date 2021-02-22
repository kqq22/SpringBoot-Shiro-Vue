package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface ShopsDetailsDao {
    List<JSONObject> selShopsDetails(JSONObject jsonObject);

    int addShopsDetails(JSONObject jsonObject);

    int updateShopsDetails(JSONObject jsonObject);

    int removeShopsDetails(JSONObject jsonObject);


}
