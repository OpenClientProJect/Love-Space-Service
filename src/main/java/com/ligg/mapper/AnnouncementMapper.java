package com.ligg.mapper;

import com.ligg.pojo.Announcement;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnnouncementMapper {

    /**
     * 发布公告
     */
    @Insert("insert into announcement(title,text,cover_url,video_url)" +
            "values(#{title},#{text},#{coverUrl},#{videoUrl} ) ")
    void publish(Announcement announcement);
}
