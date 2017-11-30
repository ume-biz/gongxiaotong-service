package cn.com.gxt.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.umeframework.dora.service.BaseComponent;
import org.umeframework.dora.util.CodecUtil;

import cn.com.gxt.biz.ReqManageService;
import cn.com.gxt.biz.dto.ReqDescExDto;
import cn.com.gxt.biz.dto.ReqManageDto;
import cn.com.gxt.entity.crud.ReqCrudService;
import cn.com.gxt.entity.crud.ReqDescCrudService;

/**
 * 需求管理服务。<br>
 * 
 * @author mayue
 *
 */
@Service
public class ReqManageServiceImpl extends BaseComponent implements ReqManageService {

    /**
     * 需求信息表:REQ CRUD service
     */
    @Resource
    private ReqCrudService reqCrudService;

    /**
     * 需求描述属性表:REQ_DESC CRUD service
     */
    @Resource
    private ReqDescCrudService reqDescCrudService;

    /*
     * (non-Javadoc)
     * 
     * @see cn.com.gxt.biz.ReqManageService#submitRequirement(cn.com.gxt.biz.dto.ReqManageDto)
     */
    @Override
    public Integer submitRequirement(ReqManageDto reqManageDto) {

        // 创建主表信息
        int result = reqCrudService.create(reqManageDto);
        if (reqManageDto.getReqDescList() != null) {
            int descSeq = 1;
            for (ReqDescExDto reqDescEx : reqManageDto.getReqDescList()) {
                // 设置序号
                reqDescEx.setDescSeq(descSeq++);
                // BLOB变换
                reqDescEx.setDescMedia(CodecUtil.base64ToBlob(reqDescEx.getDescMediaAsBase64()));
                // 创建子表信息
                reqDescCrudService.create(reqDescEx);
            }
        }

        return result;
    }

}
