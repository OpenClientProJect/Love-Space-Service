package com.love.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.love.mapper.SubCategoryMapper;
import com.love.pojo.SubCategory;
import com.love.service.SubCategoryService;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl extends ServiceImpl<SubCategoryMapper, SubCategory> implements SubCategoryService {
}
