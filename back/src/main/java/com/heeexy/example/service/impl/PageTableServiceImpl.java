package com.heeexy.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.dao.PageTableDao;
import com.heeexy.example.service.PageTableService;
import com.heeexy.example.util.CommonUtil;
import com.heeexy.example.util.constants.ErrorEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 页面管理业务实现类
 */
@Service
public class PageTableServiceImpl implements PageTableService {
    @Resource
    private PageTableDao tableDao;

    /**
     * 分页查询页面管理
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject findPermission(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
        int count = tableDao.countPermission(jsonObject);
        List<JSONObject> list = tableDao.listPermission(jsonObject);
        return CommonUtil.successPage(jsonObject,list,count);
    }

    /**
     * 添加页面
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject addPermissions(JSONObject jsonObject) {
        List<JSONObject> list = tableDao.selPermissionByCode(jsonObject);
        //判断是否有重复code
        if(!list.isEmpty()){
            return CommonUtil.errorJson(ErrorEnum.E_30001);
        }else {
            int id = tableDao.getMaxId();
            id = (id/100+1)*100;
            jsonObject.put("id",id);
            tableDao.addPermissions(jsonObject);
            return CommonUtil.successJson();
        }

    }

    /**
     * 删除页面
     * @param jsonObject
     * @return
     */
    @Override
    public JSONObject delPermissions(JSONObject jsonObject) {
        tableDao.delPermissions(jsonObject);
        return CommonUtil.successJson();
    }
}
