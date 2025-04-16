package com.ligg.service.impl;

import com.ligg.mapper.VideoLikesMapper;
import com.ligg.pojo.Video;
import com.ligg.service.VideoLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoLikeServiceImpl implements VideoLikeService {

    @Autowired
    private VideoLikesMapper videoLikesMapper;

    @Override
    public List<Video> getVideoLikeList(Long id) {
        return videoLikesMapper.findVideoLikeList(id);
    }
}
