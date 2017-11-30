package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.BidDescDto;
import cn.com.gxt.entity.crud.BidDescCrudService;

/**
 * 抢单描述属性表:BID_DESC CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class BidDescCrudServiceImpl extends BaseDBComponent implements BidDescCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(BidDescDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(BidDescDto.SQLID.INSERT_HISTORY_C, entity);
        }
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(BidDescDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<BidDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDescDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(BidDescDto entity) {
        BidDescDto existed = super.getDao().queryForObject(BidDescDto.SQLID.FIND, entity, BidDescDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<BidDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDescDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(BidDescDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(BidDescDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(BidDescDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<BidDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDescDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(BidDescDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(BidDescDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(BidDescDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<BidDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDescDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(BidDescDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(BidDescDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(BidDescDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<BidDescDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDescDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#find
     */
    @Override
    public BidDescDto find(BidDescDto queryParam) {
        return super.getDao().queryForObject(BidDescDto.SQLID.FIND, queryParam, BidDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#findList
     */
    @Override
    public List<BidDescDto> findList(BidDescDto condition) {
        return super.getDao().queryForObjectList(BidDescDto.SQLID.FIND_LIST, condition, BidDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#findListLike
     */
    @Override
    public List<BidDescDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(BidDescDto.SQLID.FIND_LIST_LIKE, condition, BidDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService#findListMatch
     */
    @Override
    public List<BidDescDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(BidDescDto.SQLID.FIND_LIST_MATCH, dynaCondition, BidDescDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidDescCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(BidDescDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(BidDescDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
