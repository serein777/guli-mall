package com.zzw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzw.gulimall.product.entity.CommentReplayEntity;
import com.zzw.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-06 15:12:21
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

