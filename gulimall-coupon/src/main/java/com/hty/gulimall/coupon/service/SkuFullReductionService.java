package com.hty.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hty.common.utils.PageUtils;
import com.hty.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 19:07:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

