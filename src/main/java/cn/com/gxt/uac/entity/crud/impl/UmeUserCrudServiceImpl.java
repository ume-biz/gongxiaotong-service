package cn.com.gxt.uac.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.uac.entity.UmeUserDto;
import cn.com.gxt.uac.entity.crud.UmeUserCrudService;

/**
 * 供销通用户表:UME_USER CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeUserCrudServiceImpl extends BaseDBComponent implements UmeUserCrudService {

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UmeUserDto entity) {
        validate(entity);
        int result = super.getDao().update(UmeUserDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UmeUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UmeUserDto entity) {
        UmeUserDto existed = super.getDao().queryForObject(UmeUserDto.SQLID.FIND, entity, UmeUserDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UmeUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UmeUserDto entity) {
        validate(entity);
        int result = super.getDao().update(UmeUserDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UmeUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UmeUserDto entity) {
        validate(entity);
        int result = super.getDao().update(UmeUserDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UmeUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UmeUserDto entity) {
        int result = super.getDao().update(UmeUserDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UmeUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    public UmeUserDto find(UmeUserDto queryParam) {
        return super.getDao().queryForObject(UmeUserDto.SQLID.FIND, queryParam, UmeUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    public List<UmeUserDto> search(UmeUserDto condition) {
        return super.getDao().queryForObjectList(UmeUserDto.SQLID.SEARCH, condition, UmeUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    public List<UmeUserDto> likeSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeUserDto.SQLID.LIKE_SEARCH, condition, UmeUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    public List<UmeUserDto> dynaSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeUserDto.SQLID.DYNA_SEARCH, condition, UmeUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(UmeUserDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeUserDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
