package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface InformationDao {
    public List<JSONObject> selArticle(JSONObject jsonObject);
}
