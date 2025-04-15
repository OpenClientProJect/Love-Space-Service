package com.ligg.service;

import com.ligg.pojo.Announcement;

public interface AnnouncementService {

    /**
     * 发布公告
     */
    void publish(Announcement announcement);
}
