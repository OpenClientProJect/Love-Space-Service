package com.ligg.service.impl;

import com.ligg.mapper.AnnouncementMapper;
import com.ligg.pojo.Announcement;
import com.ligg.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    @Override
    public void publish(Announcement announcement) {


        announcementMapper.publish(announcement);
    }
}
