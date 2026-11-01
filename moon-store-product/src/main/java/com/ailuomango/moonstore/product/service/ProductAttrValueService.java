package com.ailuomango.moonstore.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ailuomango.common.utils.PageUtils;
import com.ailuomango.moonstore.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spuå±žæ€§å€¼
 *
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:58
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

