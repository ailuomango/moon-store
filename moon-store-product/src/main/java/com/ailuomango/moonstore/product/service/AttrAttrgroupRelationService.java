package com.ailuomango.moonstore.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ailuomango.common.utils.PageUtils;
import com.ailuomango.moonstore.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * å±žæ€§&å±žæ€§åˆ†ç»„å…³è”
 *
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:59
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

