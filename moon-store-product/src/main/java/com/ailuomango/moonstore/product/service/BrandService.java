package com.ailuomango.moonstore.product.service;

import com.ailuomango.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ailuomango.moonstore.product.entity.BrandEntity;


import java.util.Map;

/**
 * å“ç‰Œ
 *
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:58
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

