package com.ligg.service;

import com.ligg.pojo.Activity;

import java.util.List;

public interface ActivityService {
    void save(Activity activity);

    List<Activity> getActivityList();
}
