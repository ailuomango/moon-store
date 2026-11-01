package com.ailuomango.moonstore.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ailuomango.common.utils.PageUtils;
import com.ailuomango.moonstore.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spuä¿¡æ¯
 *
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:58
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

