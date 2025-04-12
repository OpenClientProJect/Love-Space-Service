package com.ligg.service.admin;

import com.ligg.pojo.Video;

import java.util.List;

public interface AdminVideoService {

    /**
     * 获取草稿视频列表
     */
    List<Video> getDraftVideoList();

    /**
     * 拷贝视频
     */
    void AuditVideo(Integer id);
}
