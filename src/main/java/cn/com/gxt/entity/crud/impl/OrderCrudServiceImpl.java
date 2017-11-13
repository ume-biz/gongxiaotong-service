package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.OrderDto;
import cn.com.gxt.entity.crud.OrderCrudService;

/**
 * 需求信息主表:ORDER CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class OrderCrudServiceImpl extends BaseDBComponent implements OrderCrudService {
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
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(OrderDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderDto.SQLID.INSERT_HISTORY_C, entity);
        }
        int result = super.getDao().update(OrderDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderDto entity) {
        OrderDto existed = super.getDao().queryForObject(OrderDto.SQLID.FIND, entity, OrderDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(OrderDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        int result = super.getDao().update(OrderDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(OrderDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(OrderDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public OrderDto find(OrderDto queryParam) {
        return super.getDao().queryForObject(OrderDto.SQLID.FIND, queryParam, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public List<OrderDto> search(OrderDto condition) {
        return super.getDao().queryForObjectList(OrderDto.SQLID.SEARCH, condition, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public List<OrderDto> likeSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(OrderDto.SQLID.LIKE_SEARCH, condition, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public List<OrderDto> dynaSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(OrderDto.SQLID.DYNA_SEARCH, condition, OrderDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(OrderDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(OrderDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
