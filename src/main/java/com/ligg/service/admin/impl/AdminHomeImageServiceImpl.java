package com.ligg.service.admin.impl;

import com.ligg.mapper.admin.AdminHomeImageMapper;
import com.ligg.pojo.HomeImage;
import com.ligg.service.admin.AdminHomeImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdminHomeImageServiceImpl implements AdminHomeImageService {

    @Autowired
    private AdminHomeImageMapper adminHomeImageMapper;

    @Override
    public void add(HomeImage homeImage) {
        adminHomeImageMapper.add(homeImage);
    }

    @Override
    public List<HomeImage> getHomeImageList() {
        return adminHomeImageMapper.getHomeImageList();
    }

    @Override
    public List<Map<String, Object>> getBackground() {
        return adminHomeImageMapper.getBackground();
    }

    @Override
    public void update(HomeImage homeImage) {
        adminHomeImageMapper.update(homeImage);
    }

    @Override
    public void delete(Integer homeImgId) {
        adminHomeImageMapper.delete(homeImgId);
    }
}
