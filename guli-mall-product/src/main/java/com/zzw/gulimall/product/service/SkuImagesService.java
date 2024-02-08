package com.zzw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.common.utils.PageUtils;
import com.zzw.gulimall.product.entity.SkuImagesEntity;
import com.zzw.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * sku图片
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-06 15:12:21
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

