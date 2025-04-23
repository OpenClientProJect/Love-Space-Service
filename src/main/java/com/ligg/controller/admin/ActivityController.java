package com.ligg.controller.admin;

import com.ligg.pojo.Activity;
import com.ligg.pojo.Result;
import com.ligg.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    //添加
    @PostMapping
    public Result<?> addActivity(@RequestBody Activity activity) {
        activityService.save(activity);
        return Result.success();
    }
    //获取
    @GetMapping
    public Result<List<Activity>> getActivityList() {
        return Result.success(activityService.getActivityList());
    }
}
