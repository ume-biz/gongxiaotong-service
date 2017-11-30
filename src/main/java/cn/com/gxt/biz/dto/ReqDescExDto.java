package cn.com.gxt.biz.dto;

import cn.com.gxt.entity.ReqDescDto;

/**
 * 需求描述属性扩展实体。<br>
 * 
 * @author mayue
 */
public class ReqDescExDto extends ReqDescDto {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Base64格式的描述媒体内容。<br>
	 */
	private String descMediaAsBase64;

	/**
	 * getDescMediaAsBase64
	 * 
	 * @return
	 */
	public String getDescMediaAsBase64() {
		return descMediaAsBase64;
	}

	/**
	 * setDescMediaAsBase64
	 * 
	 * @param descMediaAsBase64
	 */
	public void setDescMediaAsBase64(String descMediaAsBase64) {
		this.descMediaAsBase64 = descMediaAsBase64;
	}

}
