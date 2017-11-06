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
 * 用户配送地址管理表:UME_USER_ADDRESS<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class UmeUserAddressCrudServiceImpl extends BaseDBComponent implements UmeUserAddressCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(UmeUserAddressDto entity) {
        validate(entity);
        return getDao().update(UmeUserAddressDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(UmeUserAddressDto entity) {
        UmeUserAddressDto existed = getDao().queryForObject(UmeUserAddressDto.SQLID.FIND, entity, UmeUserAddressDto.class);
        if (existed == null) {
            return getDao().update(UmeUserAddressDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(UmeUserAddressDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(UmeUserAddressDto entity) {
        validate(entity);
        return getDao().update(UmeUserAddressDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(UmeUserAddressDto entity) {
        validate(entity);
        return getDao().update(UmeUserAddressDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(UmeUserAddressDto entity) {
        return getDao().update(UmeUserAddressDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<UmeUserAddressDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (UmeUserAddressDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    public UmeUserAddressDto find(UmeUserAddressDto queryParam) {
        return getDao().queryForObject(UmeUserAddressDto.SQLID.FIND, queryParam, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    public List<UmeUserAddressDto> search(UmeUserAddressDto condition) {
        return getDao().queryForObjectList(UmeUserAddressDto.SQLID.SEARCH, condition, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    public List<UmeUserAddressDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeUserAddressDto.SQLID.LIKE_SEARCH, condition, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    public List<UmeUserAddressDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(UmeUserAddressDto.SQLID.DYNA_SEARCH, condition, UmeUserAddressDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.uac.entity.crud.impl.UmeUserAddressCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(UmeUserAddressDto.SQLID.COUNT, condition);
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
