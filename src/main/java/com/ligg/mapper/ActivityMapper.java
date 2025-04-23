package com.ligg.mapper;

import com.ligg.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActivityMapper {

    @Insert("insert into activity(text,title,image,create_time)" +
            " values(#{text},#{title},#{image},NOW())")
    void save(Activity activity);
    @Select("select * from activity")
    List<Activity> getActivityList();
}
