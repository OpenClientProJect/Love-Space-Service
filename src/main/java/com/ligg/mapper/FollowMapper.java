package com.ligg.mapper;

import com.ligg.pojo.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FollowMapper {

    /**
     * 关注列表
     */
    List<User> FollowList(Long userId);
}
