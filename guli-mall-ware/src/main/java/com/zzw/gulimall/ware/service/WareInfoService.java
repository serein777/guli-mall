package com.zzw.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.common.utils.PageUtils;
import com.zzw.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-07 01:23:23
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

