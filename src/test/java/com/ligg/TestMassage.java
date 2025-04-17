package com.ligg;

import com.ligg.dto.VideoDto;
import com.ligg.service.User.UserMessageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TestMassage {

    @MockBean
    private ServerEndpointExporter serverEndpointExporter;

    @Autowired
    private UserMessageService userMessageService;


    @Test
    public void getMassage() {
//        Long userId = 2450284789L;
//        List<VideoDto> userMassage = userMessageService.getUserMassage(userId);
//       //遍历输所有数据
//        for (VideoDto videoDto : userMassage) {
//            System.out.println("用户"+videoDto.getUserId() + "点赞了你的" +videoDto.getVideoId()+ "这条视频，" + "视频标题是：" + videoDto.getTitle());
//        }
    }
}
