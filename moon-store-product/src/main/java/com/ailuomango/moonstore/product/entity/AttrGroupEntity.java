package com.ailuomango.moonstore.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * å±žæ€§åˆ†ç»„
 * 
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:59
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * åˆ†ç»„id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * ç»„å
	 */
	private String attrGroupName;
	/**
	 * æŽ’åº
	 */
	private Integer sort;
	/**
	 * æè¿°
	 */
	private String descript;
	/**
	 * ç»„å›¾æ ‡
	 */
	private String icon;
	/**
	 * æ‰€å±žåˆ†ç±»id
	 */
	private Long catelogId;

}
