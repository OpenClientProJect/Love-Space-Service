package com.love.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class MainCategory {
    @TableId
    private Long categoryId;
    private String categoryName;
}
