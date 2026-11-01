package com.ailuomango.moonstore.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ailuomango.common.utils.PageUtils;
import com.ailuomango.moonstore.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spuå›¾ç‰‡
 *
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:59
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

