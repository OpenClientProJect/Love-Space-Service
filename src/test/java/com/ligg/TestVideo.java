package com.ligg;

import com.ligg.config.WebSocketConfig;
import com.ligg.service.admin.AdminVideoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TestVideo {

    @MockBean
    private ServerEndpointExporter serverEndpointExporter;

    @Autowired
    private AdminVideoService adminVideoService;


    @Test
    public void test(){
        adminVideoService.AuditVideo(93);
    }
}
