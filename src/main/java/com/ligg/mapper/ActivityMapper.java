package com.ligg.mapper;

import com.ligg.pojo.Activity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ActivityMapper {

    @Insert("insert into activity(text,title,image,create_time)" +
            " values(#{text},#{title},#{image},NOW())")
    void save(Activity activity);
    @Select("select * from activity")
    List<Activity> getActivityList();

    @Update("update activity set text=#{text},title=#{title},image=#{image} where activity_id=#{activityId}")
    void update(Activity activity);

    @Delete("delete from activity where activity_id=#{activityId}")
    void delete(Integer activityId);
}
