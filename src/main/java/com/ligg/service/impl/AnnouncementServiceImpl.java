package com.ligg.service.impl;

import com.ligg.mapper.AnnouncementMapper;
import com.ligg.pojo.Announcement;
import com.ligg.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    /**
     * 发布公告
     */
    @Override
    public void publish(Announcement announcement) {
        announcementMapper.publish(announcement);
    }

    /**
     * 获取公告
     */
    @Override
    public List<Announcement> getAnnouncement() {
        return announcementMapper.getAnnouncement();
    }

    /**
     * 删除公告
     */
    @Override
    public void deleteAnnouncement(Integer announcementId) {
       announcementMapper.deleteAnnouncement(announcementId);
    }



}
