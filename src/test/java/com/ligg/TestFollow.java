package com.ligg;

import com.ligg.pojo.user.User;
import com.ligg.service.FollowService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestFollow {


    @Autowired
    private FollowService followService;

    @Test
    public void FollowList(){

        Long UserId = 1L;

        List<User> users = followService.FollowList(UserId);

        System.out.println(users);

    }

}
