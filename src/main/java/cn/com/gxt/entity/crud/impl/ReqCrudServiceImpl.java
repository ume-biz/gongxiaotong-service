package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.ReqDto;
import cn.com.gxt.entity.crud.ReqCrudService;

/**
 * 需求信息表:REQ CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class ReqCrudServiceImpl extends BaseDBComponent implements ReqCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(ReqDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ReqDto.SQLID.INSERT_HISTORY_C, entity);
        }
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ReqDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ReqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ReqDto entity) {
        ReqDto existed = super.getDao().queryForObject(ReqDto.SQLID.FIND, entity, ReqDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ReqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(ReqDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ReqDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ReqDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ReqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ReqDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(ReqDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(ReqDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ReqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(ReqDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ReqDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(ReqDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ReqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#find
     */
    @Override
    public ReqDto find(ReqDto queryParam) {
        return super.getDao().queryForObject(ReqDto.SQLID.FIND, queryParam, ReqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#findList
     */
    @Override
    public List<ReqDto> findList(ReqDto condition) {
        return super.getDao().queryForObjectList(ReqDto.SQLID.FIND_LIST, condition, ReqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#findListLike
     */
    @Override
    public List<ReqDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(ReqDto.SQLID.FIND_LIST_LIKE, condition, ReqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService#findListMatch
     */
    @Override
    public List<ReqDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(ReqDto.SQLID.FIND_LIST_MATCH, dynaCondition, ReqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(ReqDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ReqDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
