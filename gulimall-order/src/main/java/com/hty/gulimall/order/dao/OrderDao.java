package com.hty.gulimall.order.dao;

import com.hty.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 20:53:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
