package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.ReqBidDto;
import cn.com.gxt.entity.crud.ReqBidCrudService;

/**
 * 需求竞标信息表:REQ_BID<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class ReqBidCrudServiceImpl extends BaseDBComponent implements ReqBidCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(ReqBidDto entity) {
        validate(entity);
        return getDao().update(ReqBidDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ReqBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqBidDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ReqBidDto entity) {
        ReqBidDto existed = getDao().queryForObject(ReqBidDto.SQLID.FIND, entity, ReqBidDto.class);
        if (existed == null) {
            return getDao().update(ReqBidDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(ReqBidDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ReqBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqBidDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(ReqBidDto entity) {
        validate(entity);
        return getDao().update(ReqBidDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ReqBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqBidDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ReqBidDto entity) {
        validate(entity);
        return getDao().update(ReqBidDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ReqBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqBidDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(ReqBidDto entity) {
        return getDao().update(ReqBidDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ReqBidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqBidDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    public ReqBidDto find(ReqBidDto queryParam) {
        return getDao().queryForObject(ReqBidDto.SQLID.FIND, queryParam, ReqBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    public List<ReqBidDto> search(ReqBidDto condition) {
        return getDao().queryForObjectList(ReqBidDto.SQLID.SEARCH, condition, ReqBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    public List<ReqBidDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ReqBidDto.SQLID.LIKE_SEARCH, condition, ReqBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    public List<ReqBidDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ReqBidDto.SQLID.DYNA_SEARCH, condition, ReqBidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqBidCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(ReqBidDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ReqBidDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
