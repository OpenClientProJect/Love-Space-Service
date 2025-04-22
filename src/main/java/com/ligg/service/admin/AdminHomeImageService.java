package com.ligg.service.admin;

import com.ligg.pojo.HomeImage;

import java.util.List;
import java.util.Map;

public interface AdminHomeImageService {

    void add(HomeImage homeImage);

    List<HomeImage> getHomeImageList();

    List<Map<String,Object>> getBackground();

    void update(HomeImage homeImage);

    void delete(Integer homeImgId);
}
