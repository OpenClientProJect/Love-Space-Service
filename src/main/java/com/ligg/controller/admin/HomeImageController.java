package com.ligg.controller.admin;

import com.ligg.pojo.HomeImage;
import com.ligg.pojo.Result;
import com.ligg.service.admin.AdminHomeImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/homeImage")
public class HomeImageController {

    @Autowired
    private AdminHomeImageService adminHomeImageService;

    @PostMapping("/upload")
    public Result<?> upload(@RequestBody HomeImage homeImage) {
        adminHomeImageService.add(homeImage);
        return Result.success();
    }

    @GetMapping
    public Result<List<HomeImage>> getHomeImageList() {
        List<HomeImage> homeImageList = adminHomeImageService.getHomeImageList();
        return Result.success(homeImageList);
    }
    @GetMapping("/background")
    public Result<List<Map<String,Object>>> getBackground() {
        List<Map<String,Object>> background = adminHomeImageService.getBackground();
        return Result.success(background);
    }

    //编辑
    @PutMapping
    public Result<?> update(@RequestBody HomeImage homeImage) {
        adminHomeImageService.update(homeImage);
        return Result.success();
    }

    //删除
    @DeleteMapping("/{homeImgId}")
    public Result<?> delete(@PathVariable("homeImgId") Integer homeImgId) {
        adminHomeImageService.delete(homeImgId);
        return Result.success();
    }
}
