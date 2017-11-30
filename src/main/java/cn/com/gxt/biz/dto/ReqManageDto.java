
package cn.com.gxt.biz.dto;

import java.io.Serializable;
import java.util.List;

import cn.com.gxt.entity.ReqDto;

/**
 * 需求·订单管理信息数据实体。<br>
 * 
 * @author mayue
 */

public class ReqManageDto extends ReqDto implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;
    
    /**
     * 需求描述属性列表。<br>
     */
    private List<ReqDescExDto> reqDescList;

	/**
	 * getReqDescList
	 * 
	 * @return
	 */
	public List<ReqDescExDto> getReqDescList() {
		return reqDescList;
	}

	/**
	 * setReqDescList
	 * 
	 * @param reqDescList
	 */
	public void setReqDescList(List<ReqDescExDto> reqDescList) {
		this.reqDescList = reqDescList;
	}




}
