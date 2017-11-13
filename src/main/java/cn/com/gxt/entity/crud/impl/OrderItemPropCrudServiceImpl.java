package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.OrderItemPropDto;
import cn.com.gxt.entity.crud.OrderItemPropCrudService;

/**
 * 需求信息品类属性描述表:ORDER_ITEM_PROP CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class OrderItemPropCrudServiceImpl extends BaseDBComponent implements OrderItemPropCrudService {
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
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(OrderItemPropDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemPropDto.SQLID.INSERT_HISTORY_C, entity);
        }
        int result = super.getDao().update(OrderItemPropDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<OrderItemPropDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemPropDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(OrderItemPropDto entity) {
        OrderItemPropDto existed = super.getDao().queryForObject(OrderItemPropDto.SQLID.FIND, entity, OrderItemPropDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<OrderItemPropDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemPropDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(OrderItemPropDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemPropDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        int result = super.getDao().update(OrderItemPropDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<OrderItemPropDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemPropDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(OrderItemPropDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemPropDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(OrderItemPropDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<OrderItemPropDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemPropDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(OrderItemPropDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(OrderItemPropDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(OrderItemPropDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<OrderItemPropDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (OrderItemPropDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    public OrderItemPropDto find(OrderItemPropDto queryParam) {
        return super.getDao().queryForObject(OrderItemPropDto.SQLID.FIND, queryParam, OrderItemPropDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    public List<OrderItemPropDto> search(OrderItemPropDto condition) {
        return super.getDao().queryForObjectList(OrderItemPropDto.SQLID.SEARCH, condition, OrderItemPropDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    public List<OrderItemPropDto> likeSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(OrderItemPropDto.SQLID.LIKE_SEARCH, condition, OrderItemPropDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    public List<OrderItemPropDto> dynaSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(OrderItemPropDto.SQLID.DYNA_SEARCH, condition, OrderItemPropDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.OrderItemPropCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(OrderItemPropDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(OrderItemPropDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
