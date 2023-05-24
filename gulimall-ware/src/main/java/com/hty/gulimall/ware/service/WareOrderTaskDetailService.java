package com.hty.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hty.common.utils.PageUtils;
import com.hty.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 21:03:07
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

