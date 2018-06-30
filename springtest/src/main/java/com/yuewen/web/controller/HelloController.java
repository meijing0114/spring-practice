package com.yuewen.web.controller;

import com.alibaba.fastjson.JSON;
import com.yuewen.web.entity.SplashScreenEntity;
import com.yuewen.web.entity.AndroidCloudSettingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @RequestMapping("/index")
    public String index() {


        System.out.printf("splashscrre" );
        System.out.printf("cloudSetting");

        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/simulate")
    public String simulateError() {
        System.out.printf("simulate");

        List<Integer> integers = new ArrayList<>();
        integers.get(0);

        return "simulateError";
    }

    @RequestMapping(value = "/uploadAndroid", method = RequestMethod.POST)
    @ResponseBody
    public String uploadAndroidFile(@RequestParam("file") MultipartFile file) {

        File writename = new File("./" + file.getOriginalFilename()); // 相对路径，如果没有则要建立一个新的output。txt文件

        try {
            OutputStream os = new FileOutputStream(writename);
            os.write(file.getBytes());
            os.close();
        }
        catch (IOException e) {
            System.out.printf("error");
        }
        return "";
    }

}