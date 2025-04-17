package com.ligg.service.User;

import com.ligg.dto.UserChatMessageDto;
import com.ligg.dto.VideoDto;
import com.ligg.pojo.Video;
import com.ligg.vo.UserMessageVo;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface UserMessageService {

    /**
     * 用户消息服务
     */
    List<VideoDto> getUserMassage(Long userId);

    /**
     * 私信消息
     */
    List<UserChatMessageDto> getAllChatMessage(String username);
}
