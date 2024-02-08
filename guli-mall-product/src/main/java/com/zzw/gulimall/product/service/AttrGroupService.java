package com.zzw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.product.entity.AttrGroupEntity;
import com.zzw.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-06 15:12:21
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

