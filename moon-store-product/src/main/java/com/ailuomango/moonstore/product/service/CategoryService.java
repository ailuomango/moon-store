package com.ailuomango.moonstore.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ailuomango.common.utils.PageUtils;
import com.ailuomango.moonstore.product.entity.CategoryEntity;

import java.util.Map;

/**
 * å•†å“ä¸‰çº§åˆ†ç±»
 *
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

