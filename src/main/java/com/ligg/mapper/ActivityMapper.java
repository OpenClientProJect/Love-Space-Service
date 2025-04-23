package com.ligg.mapper;

import com.ligg.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActivityMapper {

    @Insert("insert into activity(text,title,image,create_time)" +
            " values(#{text},#{title},#{image},#{createTime})")
    void save(Activity activity);
}
