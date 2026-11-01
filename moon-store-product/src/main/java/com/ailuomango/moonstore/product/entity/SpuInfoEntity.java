package com.ailuomango.moonstore.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuä¿¡æ¯
 * 
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:58
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * å•†å“id
	 */
	@TableId
	private Long id;
	/**
	 * å•†å“åç§°
	 */
	private String spuName;
	/**
	 * å•†å“æè¿°
	 */
	private String spuDescription;
	/**
	 * æ‰€å±žåˆ†ç±»id
	 */
	private Long catalogId;
	/**
	 * å“ç‰Œid
	 */
	private Long brandId;
	/**
	 * 
	 */
	private BigDecimal weight;
	/**
	 * ä¸Šæž¶çŠ¶æ€[0 - ä¸‹æž¶ï¼Œ1 - ä¸Šæž¶]
	 */
	private Integer publishStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
