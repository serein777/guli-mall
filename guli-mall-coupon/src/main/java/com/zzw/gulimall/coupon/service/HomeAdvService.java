package com.zzw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.common.utils.PageUtils;
import com.zzw.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-07 01:35:15
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

