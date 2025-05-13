package com.love.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.love.pojo.MainCategory;
import com.love.pojo.Result;
import com.love.pojo.SubCategory;
import com.love.service.MainCategoryService;
import com.love.service.SubCategoryService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分类
 */
@RestController
@RequestMapping("/api/admin/category")
public class CategoryController {

    @Autowired
    private MainCategoryService mainCategoryService;
    @Autowired
    private SubCategoryService subCategoryService;

    /**
     * 获取分类列表
     */
    @GetMapping("/getCategoryList")
    public Result<Map<String, Object>> getCategoryList() {
        HashMap<String, Object> categoryMap = new HashMap<>();
        categoryMap.put("mainCategoryList", mainCategoryService.getBaseMapper().selectList(null));
        categoryMap.put("subCategoryList", subCategoryService.getBaseMapper().selectList(null));
        return Result.success(categoryMap);
    }

    /**
     * 添加或编辑主分类
     */
    @PostMapping("/addMainCategory")
    public Result<String> addMainCategory(@RequestBody MainCategory mainCategory) {
        mainCategoryService.saveOrUpdate(mainCategory);
        return Result.success();
    }


    /**
     * 添加或编辑子分类
     */
    @PostMapping("/addSubCategory")
    public Result<String> addSubCategory(@RequestBody SubCategory subCategory) {
        subCategoryService.saveOrUpdate(subCategory);
        return Result.success();
    }

    /**
     * 删除主分类
     */
    @DeleteMapping("/deleteMainCategory")
    public Result<String> deleteMainCategory(Integer categoryId) {
        mainCategoryService.removeById(categoryId);
        return Result.success();
    }

    /**
     * 删除子分类
     */
    @DeleteMapping("/deleteSubCategory")
    public Result<String> deleteSubCategory(Integer categoryId) {
        subCategoryService.removeById(categoryId);
        return Result.success();
    }
}
