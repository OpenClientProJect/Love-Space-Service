package com.love.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//副分类
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sub_category")
public class SubCategory {
    @TableId
    private Long categoryId;
    private Long mainCategoryId;
    private String categoryName;
}
