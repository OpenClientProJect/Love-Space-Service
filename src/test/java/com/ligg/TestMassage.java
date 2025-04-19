package com.ligg;

import com.ligg.dto.UserChatMessageDto;
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
        String username = "245678780817";
          for (UserChatMessageDto userChatMessageDto : userMessageService.getAllChatMessage(username)) {
              System.out.println(userChatMessageDto);
        }
    }
}
