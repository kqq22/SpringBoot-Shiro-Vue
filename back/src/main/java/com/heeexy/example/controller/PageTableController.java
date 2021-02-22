package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.PageTableService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 页面管理控制类
 */
@RestController
@RequestMapping("/pageTable")
public class PageTableController {
    @Autowired
    private PageTableService pageTableService;

    /**
     * 分页查询页面管理
     * @param request
     * @return
     */
    @GetMapping("/findPermission")
    public JSONObject findPermission(HttpServletRequest request){
        return pageTableService.findPermission(CommonUtil.request2Json(request));
    }

    /**
     * 添加页面
     * @param requestJson
     * @return
     */
    @PostMapping("/addPermissions")
    public JSONObject addPermissions(@RequestBody JSONObject requestJson){
        CommonUtil.hasAllRequired(requestJson,"code,name");
        return pageTableService.addPermissions(requestJson);
    }

    /**
     * 删除页面
     * @param requestJson
     * @return
     */
    @PostMapping("/delPermission")
    public JSONObject delPermission(@RequestBody JSONObject requestJson){
        System.out.println(requestJson);
        CommonUtil.hasAllRequired(requestJson,"code");
        return pageTableService.delPermissions(requestJson);
    }
}
