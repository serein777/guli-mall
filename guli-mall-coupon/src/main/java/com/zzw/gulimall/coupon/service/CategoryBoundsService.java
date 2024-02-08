package com.zzw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.common.utils.PageUtils;
import com.zzw.gulimall.coupon.entity.CategoryBoundsEntity;

import java.util.Map;

/**
 * 商品分类积分设置
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-07 01:35:15
 */
public interface CategoryBoundsService extends IService<CategoryBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

