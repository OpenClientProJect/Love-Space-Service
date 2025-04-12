package com.ligg.service.admin.impl;

import com.ligg.mapper.admin.AdminVideoMapper;
import com.ligg.pojo.Video;
import com.ligg.service.admin.AdminVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminVideoServiceImpl implements AdminVideoService {

    @Autowired
    private AdminVideoMapper adminVideoMapper;


    @Override
    public List<Video> getDraftVideoList() {
        return adminVideoMapper.getDraftVideoList();
    }

    /**
     * 视频审核
     */
    @Override
    public void AuditVideo(Integer id) {
        adminVideoMapper.copyVideo(id);
        adminVideoMapper.deleteVideo(id);
    }

}
