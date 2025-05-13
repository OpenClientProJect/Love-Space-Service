package com.love.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class MainCategory {
    @TableId(type = IdType.AUTO)
    private Integer categoryId;
    private String categoryName;
}
