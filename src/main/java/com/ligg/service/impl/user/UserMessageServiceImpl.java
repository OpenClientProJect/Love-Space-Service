package com.ligg.service.impl.user;

import com.ligg.dto.CommentDto;
import com.ligg.dto.UserChatMessageDto;
import com.ligg.dto.VideoDto;
import com.ligg.mapper.CommentsMapper;
import com.ligg.mapper.user.UserChatMessageMapper;
import com.ligg.mapper.user.UserVideoMapper;
import com.ligg.pojo.Comments;
import com.ligg.pojo.Video;
import com.ligg.service.User.UserMessageService;
import com.ligg.utils.ThreadLocalUtil;
import com.ligg.vo.UserMessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private UserVideoMapper userVideoMapper;

    @Autowired
    private UserChatMessageMapper userChatMessageMapper;

    @Autowired
    private CommentsMapper commentsMapper;

    @Override
    public List<VideoDto> getUserMassage(Long userId) {
        return userVideoMapper.listByUserId(userId);
    }

    @Override
    public List<UserChatMessageDto> getAllChatMessage(String username) {
        return userChatMessageMapper.getAllChatMessage(username);
    }

    @Override
    public List<CommentDto> getAllCommentsMessage(Long userId) {
        return commentsMapper.getAllCommentsMessage(userId);
    }
}
