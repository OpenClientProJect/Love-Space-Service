package com.ligg.service.impl;

import com.ligg.mapper.ActivityMapper;
import com.ligg.pojo.Activity;
import com.ligg.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public void save(Activity activity) {
        activityMapper.save(activity);
    }
}
