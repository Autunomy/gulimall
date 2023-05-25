package com.hty.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hty.common.utils.PageUtils;
import com.hty.common.utils.Query;

import com.hty.gulimall.product.dao.CategoryDao;
import com.hty.gulimall.product.entity.CategoryEntity;
import com.hty.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //组装成父子属性结构
        //查询一级菜单s
        List<CategoryEntity> level1Menu = entities.stream()
                .filter((categoryEntity) -> categoryEntity.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                })
                .sorted((menu1,menu2)-> {
                    return (menu1.getSort() == null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());

        return level1Menu;
    }

    /**
     * 递归查找当前root菜单的所有子菜单以及子菜单的子菜单
     * @param root 当前的父菜单
     * @param all 所有的菜单信息(包含1,2,3级菜单)
     * @return root的所有子菜单
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
                    //当前菜单的
                    return categoryEntity.getParentCid() == root.getCatId();
                }).map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());

        return children;
    }
}