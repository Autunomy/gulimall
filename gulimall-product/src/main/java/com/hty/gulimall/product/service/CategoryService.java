package com.hty.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hty.common.utils.PageUtils;
import com.hty.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 11:16:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

