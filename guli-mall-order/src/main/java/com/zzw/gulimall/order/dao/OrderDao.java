package com.zzw.gulimall.order.dao;

import com.zzw.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-07 01:27:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
