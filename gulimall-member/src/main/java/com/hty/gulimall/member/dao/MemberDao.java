package com.hty.gulimall.member.dao;

import com.hty.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hty
 * @email 1156388927@qq.com
 * @date 2023-05-24 20:00:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
