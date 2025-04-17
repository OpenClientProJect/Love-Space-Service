package com.ligg.controller.user;


import com.ligg.dto.VideoDto;
import com.ligg.pojo.Result;
import com.ligg.service.User.UserMessageService;
import com.ligg.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user/message")
public class UserMessageController {

    @Autowired
    private UserMessageService userMessageService;

    @GetMapping
        public Result<List<VideoDto>> getUserMassage(){
        Map<String,Object> map = ThreadLocalUtil.get();
        Long userId = (Long) map.get("id");
        List<VideoDto> userMassage = userMessageService.getUserMassage(userId);
        return Result.success(userMassage);
    }
}
