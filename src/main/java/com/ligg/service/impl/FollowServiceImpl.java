package com.ligg.service.impl;

import com.ligg.mapper.FollowMapper;
import com.ligg.pojo.user.User;
import com.ligg.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService {

    @Autowired
    private FollowMapper followMapper;

    @Override
    public List<User> FollowList(Long userId) {
        List<User> users = followMapper.FollowList(userId);
        for (User user : users) {
            user.setRole(null);
        }
        return users;
    }
}
