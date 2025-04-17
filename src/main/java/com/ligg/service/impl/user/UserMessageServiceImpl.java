package com.ligg.service.impl.user;

import com.ligg.dto.VideoDto;
import com.ligg.mapper.user.UserVideoMapper;
import com.ligg.pojo.Video;
import com.ligg.service.User.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private UserVideoMapper userVideoMapper;

    @Override
    public List<VideoDto> getUserMassage(Long userId) {
        List<VideoDto> videos = userVideoMapper.listByUserId(userId);
        return videos;
    }
}
