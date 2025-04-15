package com.ligg.mapper;

import com.ligg.pojo.Announcement;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnnouncementMapper {

    /**
     * 发布公告
     */
    @Insert("insert into announcement(title,text,image_url,video_url,create_time)" +
            "values(#{title},#{text},#{imageUrl},#{videoUrl},NOW())")
    void publish(Announcement announcement);
}
