package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ArticleDao;
import com.heeexy.example.dao.InformationDao;
import com.heeexy.example.service.InformationService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    @Resource
    private InformationDao informationDao;

    /**
     * 查询文章列表
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject findAll(JSONObject jsonObject) {
        List<JSONObject> list = informationDao.selArticle(jsonObject);
        return CommonUtil.successJson(list);
    }
}
