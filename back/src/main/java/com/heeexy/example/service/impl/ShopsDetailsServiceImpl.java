package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.ShopsDetailsDao;
import com.heeexy.example.service.ShopsDetailsService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.SessionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 商家详情业务逻辑实现类
 */
@Service
public class ShopsDetailsServiceImpl implements ShopsDetailsService {
    @Resource
    private ShopsDetailsDao shopsDetailsDao;

    /**
     * 根据userId查询商家详情
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject findShopsDetails(JSONObject jsonObject) {
        jsonObject.put("userId",SessionUtils.getUserId());
        List<JSONObject> list = shopsDetailsDao.selShopsDetails(jsonObject);
        return CommonUtil.successPage(list);
    }

    /**
     * 修改商家详情
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject updateShopsDetails(JSONObject jsonObject) {
        jsonObject.put("Id",SessionUtils.getUserId());
        shopsDetailsDao.updateShopsDetails(jsonObject);
        return CommonUtil.successJson();
    }
}
