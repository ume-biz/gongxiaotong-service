package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.BidDto;
import cn.com.gxt.entity.crud.BidCrudService;

/**
 * 抢单信息表:BID CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class BidCrudServiceImpl extends BaseDBComponent implements BidCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(BidDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(BidDto.SQLID.INSERT_HISTORY_C, entity);
        }
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(BidDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<BidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(BidDto entity) {
        BidDto existed = super.getDao().queryForObject(BidDto.SQLID.FIND, entity, BidDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<BidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(BidDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(BidDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(BidDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<BidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(BidDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(BidDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(BidDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<BidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(BidDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(BidDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(BidDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<BidDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (BidDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#find
     */
    @Override
    public BidDto find(BidDto queryParam) {
        return super.getDao().queryForObject(BidDto.SQLID.FIND, queryParam, BidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#findList
     */
    @Override
    public List<BidDto> findList(BidDto condition) {
        return super.getDao().queryForObjectList(BidDto.SQLID.SEARCH, condition, BidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#findListLike
     */
    @Override
    public List<BidDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(BidDto.SQLID.LIKE_SEARCH, condition, BidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService#findListMatch
     */
    @Override
    public List<BidDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(BidDto.SQLID.DYNA_SEARCH, dynaCondition, BidDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.BidCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(BidDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(BidDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
