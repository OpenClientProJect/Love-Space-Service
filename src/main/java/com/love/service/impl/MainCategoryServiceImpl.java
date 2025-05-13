package com.love.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.love.mapper.MainCategoryMapper;
import com.love.pojo.MainCategory;
import com.love.service.MainCategoryService;
import org.springframework.stereotype.Service;

@Service
public class MainCategoryServiceImpl extends ServiceImpl<MainCategoryMapper, MainCategory> implements MainCategoryService {

}
