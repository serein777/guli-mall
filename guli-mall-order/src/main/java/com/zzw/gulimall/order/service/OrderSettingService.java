package com.zzw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.common.utils.PageUtils;
import com.zzw.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-07 01:27:07
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

