package com.hty.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hty.common.utils.PageUtils;
import com.hty.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 19:07:30
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

