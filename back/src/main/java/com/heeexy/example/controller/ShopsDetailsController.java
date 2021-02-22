package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.ShopsDetailsService;
import com.heeexy.example.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping("/shops")
public class ShopsDetailsController {
    @Autowired
    private ShopsDetailsService shopsDetailsService;

    /**
     * 根据userId查询商家详情
     * @param request
     * @return
     */
    @GetMapping("/findShopsDetails")
    public JSONObject findShopsDetails(HttpServletRequest request){
        return shopsDetailsService.findShopsDetails(CommonUtil.request2Json(request));
    }

    /**
     * 修改商家详情
     * @param requestJson
     * @return
     */
    @PostMapping("/updateShopsDetails")
    public JSONObject updateShopsDetails(@RequestBody JSONObject requestJson){
        CommonUtil.hasAllRequired(requestJson,"shopsName, shopsPhone, shopsAddress, shopsIntro, businessHoursStart, businessHoursEnd");
        return shopsDetailsService.updateShopsDetails(requestJson);
    }
}
