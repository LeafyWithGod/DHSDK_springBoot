package com.netsdk.controller;

import com.alibaba.fastjson.JSON;
import com.netsdk.lib.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("/dhSdkTest")
public class testController {


    @GetMapping("/test")
    public String test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("platformEncode", Utils.getPlatformEncode());
        map.put("osPrefix",Utils.getOsPrefix());
        map.put("osName",Utils.getOsName());
        return JSON.toJSONString(map);
    }


}
