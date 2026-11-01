package com.ailuomango.moonstore.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * å“ç‰Œåˆ†ç±»å…³è”
 * 
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:58
 */
@Data
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * å“ç‰Œid
	 */
	private Long brandId;
	/**
	 * åˆ†ç±»id
	 */
	private Long catelogId;
	/**
	 * 
	 */
	private String brandName;
	/**
	 * 
	 */
	private String catelogName;

}
