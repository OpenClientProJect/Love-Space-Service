package com.ligg.controller;

import com.ligg.pojo.Announcement;
import com.ligg.pojo.Result;
import com.ligg.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/announcement")
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    /**
     * 发布公告
     */
    @PostMapping
    public Result<?> publish(Announcement announcement) {
        announcementService.publish(announcement);
        return Result.success();
    }
}
