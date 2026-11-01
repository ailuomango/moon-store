package com.ailuomango.moonstore.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuå›¾ç‰‡
 * 
 * @author ailuomango
 * @email ailuomango@gmail.com
 * @date 2026-10-30 19:33:59
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * å›¾ç‰‡å
	 */
	private String imgName;
	/**
	 * å›¾ç‰‡åœ°å€
	 */
	private String imgUrl;
	/**
	 * é¡ºåº
	 */
	private Integer imgSort;
	/**
	 * æ˜¯å¦é»˜è®¤å›¾
	 */
	private Integer defaultImg;

}
