package cn.com.gxt.uac.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.uac.entity.UmeUserPaymentDto;
import cn.com.gxt.uac.entity.crud.UmeUserPaymentCrudService;

/**
 * 用户支付卡绑定管理表:UME_USER_PAYMENT<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class UmeUserPaymentCrudServiceImpl extends BaseDBComponent implements UmeUserPaymentCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UmeUserPaymentDto entity) {
        validate(entity);
        return getDao().update(UmeUserPaymentDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UmeUserPaymentDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserPaymentDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UmeUserPaymentDto entity) {
        UmeUserPaymentDto existed = getDao().queryForObject(UmeUserPaymentDto.SQLID.FIND, entity, UmeUserPaymentDto.class);
        if (existed == null) {
            return getDao().update(UmeUserPaymentDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(UmeUserPaymentDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UmeUserPaymentDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserPaymentDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UmeUserPaymentDto entity) {
        validate(entity);
        return getDao().update(UmeUserPaymentDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UmeUserPaymentDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserPaymentDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UmeUserPaymentDto entity) {
        validate(entity);
        return getDao().update(UmeUserPaymentDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UmeUserPaymentDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserPaymentDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UmeUserPaymentDto entity) {
        return getDao().update(UmeUserPaymentDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UmeUserPaymentDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserPaymentDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    public UmeUserPaymentDto find(UmeUserPaymentDto queryParam) {
        return getDao().queryForObject(UmeUserPaymentDto.SQLID.FIND, queryParam, UmeUserPaymentDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    public List<UmeUserPaymentDto> search(UmeUserPaymentDto condition) {
        return getDao().queryForObjectList(UmeUserPaymentDto.SQLID.SEARCH, condition, UmeUserPaymentDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    public List<UmeUserPaymentDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeUserPaymentDto.SQLID.LIKE_SEARCH, condition, UmeUserPaymentDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    public List<UmeUserPaymentDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeUserPaymentDto.SQLID.DYNA_SEARCH, condition, UmeUserPaymentDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserPaymentCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UmeUserPaymentDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeUserPaymentDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
