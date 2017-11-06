package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.ReqMainDto;
import cn.com.gxt.entity.crud.ReqMainCrudService;

/**
 * 需求主信息:REQ_MAIN<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class ReqMainCrudServiceImpl extends BaseDBComponent implements ReqMainCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(ReqMainDto entity) {
        validate(entity);
        return getDao().update(ReqMainDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ReqMainDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqMainDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ReqMainDto entity) {
        ReqMainDto existed = getDao().queryForObject(ReqMainDto.SQLID.FIND, entity, ReqMainDto.class);
        if (existed == null) {
            return getDao().update(ReqMainDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(ReqMainDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ReqMainDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqMainDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(ReqMainDto entity) {
        validate(entity);
        return getDao().update(ReqMainDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ReqMainDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqMainDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ReqMainDto entity) {
        validate(entity);
        return getDao().update(ReqMainDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ReqMainDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqMainDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(ReqMainDto entity) {
        return getDao().update(ReqMainDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ReqMainDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqMainDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    public ReqMainDto find(ReqMainDto queryParam) {
        return getDao().queryForObject(ReqMainDto.SQLID.FIND, queryParam, ReqMainDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    public List<ReqMainDto> search(ReqMainDto condition) {
        return getDao().queryForObjectList(ReqMainDto.SQLID.SEARCH, condition, ReqMainDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    public List<ReqMainDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ReqMainDto.SQLID.LIKE_SEARCH, condition, ReqMainDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    public List<ReqMainDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ReqMainDto.SQLID.DYNA_SEARCH, condition, ReqMainDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqMainCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(ReqMainDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ReqMainDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
