package cn.com.gxt.uac.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.uac.entity.UmeUserAddressDto;
import cn.com.gxt.uac.entity.crud.UmeUserAddressCrudService;

/**
 * 用户配送地址管理表:UME_USER_ADDRESS CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeUserAddressCrudServiceImpl extends BaseDBComponent implements UmeUserAddressCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(UmeUserAddressDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(UmeUserAddressDto.SQLID.INSERT_HISTORY_C, entity);
        }
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(UmeUserAddressDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UmeUserAddressDto entity) {
        UmeUserAddressDto existed = super.getDao().queryForObject(UmeUserAddressDto.SQLID.FIND, entity, UmeUserAddressDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(UmeUserAddressDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(UmeUserAddressDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(UmeUserAddressDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UmeUserAddressDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(UmeUserAddressDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(UmeUserAddressDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(UmeUserAddressDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(UmeUserAddressDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(UmeUserAddressDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#find
     */
    @Override
    public UmeUserAddressDto find(UmeUserAddressDto queryParam) {
        return super.getDao().queryForObject(UmeUserAddressDto.SQLID.FIND, queryParam, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#findList
     */
    @Override
    public List<UmeUserAddressDto> findList(UmeUserAddressDto condition) {
        return super.getDao().queryForObjectList(UmeUserAddressDto.SQLID.FIND_LIST, condition, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#findListLike
     */
    @Override
    public List<UmeUserAddressDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeUserAddressDto.SQLID.FIND_LIST_LIKE, condition, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService#findListMatch
     */
    @Override
    public List<UmeUserAddressDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(UmeUserAddressDto.SQLID.FIND_LIST_MATCH, dynaCondition, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(UmeUserAddressDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeUserAddressDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
