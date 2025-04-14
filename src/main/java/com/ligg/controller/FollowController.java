package com.ligg.controller;

import com.ligg.pojo.Result;
import com.ligg.pojo.user.User;
import com.ligg.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/follow")
public class FollowController {


    @Autowired
    private FollowService followService;
    // 关注列表
    @GetMapping()
    public Result<User> subscribeList(Instant id){
        return null;
    }
}
