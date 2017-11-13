package cn.com.gxt.uac.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.uac.entity.UmeWechatUserDto;
import cn.com.gxt.uac.entity.crud.UmeWechatUserCrudService;

/**
 * 微信用户基础属性表:UME_WECHAT_USER CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class UmeWechatUserCrudServiceImpl extends BaseDBComponent implements UmeWechatUserCrudService {

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UmeWechatUserDto entity) {
        validate(entity);
        int result = super.getDao().update(UmeWechatUserDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UmeWechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeWechatUserDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UmeWechatUserDto entity) {
        UmeWechatUserDto existed = super.getDao().queryForObject(UmeWechatUserDto.SQLID.FIND, entity, UmeWechatUserDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UmeWechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeWechatUserDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UmeWechatUserDto entity) {
        validate(entity);
        int result = super.getDao().update(UmeWechatUserDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UmeWechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeWechatUserDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UmeWechatUserDto entity) {
        validate(entity);
        int result = super.getDao().update(UmeWechatUserDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UmeWechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeWechatUserDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UmeWechatUserDto entity) {
        int result = super.getDao().update(UmeWechatUserDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UmeWechatUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeWechatUserDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    public UmeWechatUserDto find(UmeWechatUserDto queryParam) {
        return super.getDao().queryForObject(UmeWechatUserDto.SQLID.FIND, queryParam, UmeWechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    public List<UmeWechatUserDto> search(UmeWechatUserDto condition) {
        return super.getDao().queryForObjectList(UmeWechatUserDto.SQLID.SEARCH, condition, UmeWechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    public List<UmeWechatUserDto> likeSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeWechatUserDto.SQLID.LIKE_SEARCH, condition, UmeWechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    public List<UmeWechatUserDto> dynaSearch(Map<String, String> condition) {
        return super.getDao().queryForObjectList(UmeWechatUserDto.SQLID.DYNA_SEARCH, condition, UmeWechatUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeWechatUserCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(UmeWechatUserDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(UmeWechatUserDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
