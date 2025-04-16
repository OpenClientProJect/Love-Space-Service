package com.ligg.service;

import com.ligg.pojo.Video;

import java.util.List;

public interface VideoLikeService {

    /**
     * 用户点赞列表
     */
    List<Video> getVideoLikeList(Long userId);
}
