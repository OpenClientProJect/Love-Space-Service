package com.ligg.vo;

import com.ligg.dto.UserChatMessageDto;
import com.ligg.dto.VideoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMessageVo {
    private List<VideoDto> videoLike;//点赞信息
    private List<UserChatMessageDto> userChatMessageDto;

    public UserMessageVo(List<VideoDto> userMassage) {
        this.videoLike = userMassage;
    }
}
