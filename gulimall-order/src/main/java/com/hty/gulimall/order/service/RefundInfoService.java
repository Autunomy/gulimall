package com.hty.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hty.common.utils.PageUtils;
import com.hty.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 20:53:39
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

