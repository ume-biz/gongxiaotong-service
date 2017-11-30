package cn.com.gxt.biz;

import cn.com.gxt.biz.dto.ReqManageDto;

/**
 * 需求管理服务接口。<br>
 * 
 * @author mayue
 *
 */
public interface ReqManageService {
	
	/**
	 * 提交新需求。<br>
	 * 
	 * @param reqManageDto
	 */
	Integer submitRequirement(ReqManageDto reqManageDto);

}
