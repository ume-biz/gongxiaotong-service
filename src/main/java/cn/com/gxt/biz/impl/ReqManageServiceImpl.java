package cn.com.gxt.biz.impl;

import java.sql.Blob;
import java.util.List;

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

    @Resource
    private ReqCrudService reqCrudService;

    @Resource
    private ReqDescCrudService reqDescCrudService;

    /*
     * (non-Javadoc)
     * 
     * @see cn.com.gxt.biz.ReqManageService#submitRequirement(cn.com.gxt.biz.dto.ReqManageDto)
     */
    @Override
    public Integer submitRequirement(ReqManageDto reqManageDto) {

        int result = reqCrudService.create(reqManageDto);

        List<ReqDescExDto> reqDescExList = reqManageDto.getReqDescList();
        if (reqDescExList != null) {
            int descSeq = 1;
            for (ReqDescExDto reqDescEx : reqDescExList) {
                reqDescEx.setDescSeq(descSeq++);
                String descMediaAsBase64 = reqDescEx.getDescMediaAsBase64();
                Blob descMedia = CodecUtil.base64ToBlob(descMediaAsBase64);
                reqDescEx.setDescMedia(descMedia);
                reqDescCrudService.create(reqDescEx);
            }
        }

        return result;
    }

}
