package com.love.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.love.mapper.VideoMapper;
import com.love.pojo.Video;
import com.love.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoMapper videoMapper;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    StringRedisTemplate redisTemplate;

    // 查询所有视频
    @Override
    public List<Video> list(Long categoryId) {
        //stream流过滤掉status为等于2的视频
        return videoMapper.list(categoryId).stream()
                .filter(video -> video.getStatus() == 2)
                .toList();
    }

    // 根据id查询视频
    @Override
    public Video findById(Integer id) {
        return videoMapper.findById(id);
    }

    @Override
    public List<Video> getCollectList(Long userId) {
        return videoMapper.findVideoFavorite(userId);
    }
}
