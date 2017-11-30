package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.ReqDescDto;
import cn.com.gxt.entity.crud.ReqDescCrudService;

/**
 * 需求描述属性表:REQ_DESC CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class ReqDescCrudServiceImpl extends BaseDBComponent implements ReqDescCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(ReqDescDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ReqDescDto.SQLID.INSERT_HISTORY_C, entity);
        }
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ReqDescDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ReqDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDescDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ReqDescDto entity) {
        ReqDescDto existed = super.getDao().queryForObject(ReqDescDto.SQLID.FIND, entity, ReqDescDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ReqDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDescDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(ReqDescDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ReqDescDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ReqDescDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ReqDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDescDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ReqDescDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(ReqDescDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(ReqDescDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ReqDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDescDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(ReqDescDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ReqDescDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(ReqDescDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ReqDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqDescDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#find
     */
    @Override
    public ReqDescDto find(ReqDescDto queryParam) {
        return super.getDao().queryForObject(ReqDescDto.SQLID.FIND, queryParam, ReqDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#findList
     */
    @Override
    public List<ReqDescDto> findList(ReqDescDto condition) {
        return super.getDao().queryForObjectList(ReqDescDto.SQLID.FIND_LIST, condition, ReqDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#findListLike
     */
    @Override
    public List<ReqDescDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(ReqDescDto.SQLID.FIND_LIST_LIKE, condition, ReqDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService#findListMatch
     */
    @Override
    public List<ReqDescDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(ReqDescDto.SQLID.FIND_LIST_MATCH, dynaCondition, ReqDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqDescCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(ReqDescDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ReqDescDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
