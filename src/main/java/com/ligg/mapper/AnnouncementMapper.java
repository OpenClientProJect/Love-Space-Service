package com.ligg.mapper;

import com.ligg.pojo.Announcement;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnnouncementMapper {

    /**
     * 发布公告
     */
    @Insert("insert into announcement(title,text,image_url,video_url,create_time)" +
            "values(#{title},#{text},#{imageUrl},#{videoUrl},NOW())")
    void publish(Announcement announcement);

    /**
     * 获取公告
     */
    @Select("select * from announcement order by create_time desc")
    List<Announcement> getAnnouncement();
}
