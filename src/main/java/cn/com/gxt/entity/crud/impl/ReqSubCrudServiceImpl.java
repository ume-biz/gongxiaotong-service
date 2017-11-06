package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.ReqSubDto;
import cn.com.gxt.entity.crud.ReqSubCrudService;

/**
 * 需求发布明细信息表:REQ_SUB<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class ReqSubCrudServiceImpl extends BaseDBComponent implements ReqSubCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(ReqSubDto entity) {
        validate(entity);
        return getDao().update(ReqSubDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ReqSubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqSubDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ReqSubDto entity) {
        ReqSubDto existed = getDao().queryForObject(ReqSubDto.SQLID.FIND, entity, ReqSubDto.class);
        if (existed == null) {
            return getDao().update(ReqSubDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(ReqSubDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ReqSubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqSubDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(ReqSubDto entity) {
        validate(entity);
        return getDao().update(ReqSubDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ReqSubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqSubDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ReqSubDto entity) {
        validate(entity);
        return getDao().update(ReqSubDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ReqSubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqSubDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(ReqSubDto entity) {
        return getDao().update(ReqSubDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ReqSubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqSubDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    public ReqSubDto find(ReqSubDto queryParam) {
        return getDao().queryForObject(ReqSubDto.SQLID.FIND, queryParam, ReqSubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    public List<ReqSubDto> search(ReqSubDto condition) {
        return getDao().queryForObjectList(ReqSubDto.SQLID.SEARCH, condition, ReqSubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    public List<ReqSubDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ReqSubDto.SQLID.LIKE_SEARCH, condition, ReqSubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    public List<ReqSubDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ReqSubDto.SQLID.DYNA_SEARCH, condition, ReqSubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqSubCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(ReqSubDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ReqSubDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
