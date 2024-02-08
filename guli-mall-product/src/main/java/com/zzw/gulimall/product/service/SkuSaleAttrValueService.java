package com.zzw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.zzw.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-06 15:12:21
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

