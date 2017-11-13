package cn.com.gxt.uac.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.uac.entity.UmeUserCardDto;
import cn.com.gxt.uac.entity.crud.UmeUserCardCrudService;

/**
 * 用户支付卡绑定管理表:UME_USER_CARD CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeUserCardCrudServiceImpl extends BaseDBComponent implements UmeUserCardCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    /**
     * Disable operation history table automatic insert.<br>
     * 
     * @param enableOperationHistory the enableOperationHistory to set
     */
    public void setEnableOperationHistory(boolean enableOperationHistory) {
        this.enableOperationHistory = enableOperationHistory;
    }

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UmeUserCardDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(UmeUserCardDto.SQLID.INSERT_HISTORY_C, entity);
        }
        int result = super.getDao().update(UmeUserCardDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UmeUserCardDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserCardDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UmeUserCardDto entity) {
        UmeUserCardDto existed = super.getDao().queryForObject(UmeUserCardDto.SQLID.FIND, entity, UmeUserCardDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UmeUserCardDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserCardDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UmeUserCardDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(UmeUserCardDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        int result = super.getDao().update(UmeUserCardDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UmeUserCardDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserCardDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UmeUserCardDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(UmeUserCardDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(UmeUserCardDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UmeUserCardDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserCardDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UmeUserCardDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(UmeUserCardDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(UmeUserCardDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UmeUserCardDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserCardDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    public UmeUserCardDto find(UmeUserCardDto queryParam) {
        return super.getDao().queryForObject(UmeUserCardDto.SQLID.FIND, queryParam, UmeUserCardDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    public List<UmeUserCardDto> search(UmeUserCardDto condition) {
        return super.getDao().queryForObjectList(UmeUserCardDto.SQLID.SEARCH, condition, UmeUserCardDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    public List<UmeUserCardDto> likeSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeUserCardDto.SQLID.LIKE_SEARCH, condition, UmeUserCardDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    public List<UmeUserCardDto> dynaSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeUserCardDto.SQLID.DYNA_SEARCH, condition, UmeUserCardDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCardCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(UmeUserCardDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeUserCardDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
