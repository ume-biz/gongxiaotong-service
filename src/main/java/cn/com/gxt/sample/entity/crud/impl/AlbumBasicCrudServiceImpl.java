package cn.com.gxt.sample.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.sample.entity.AlbumBasicDto;
import cn.com.gxt.sample.entity.crud.AlbumBasicCrudService;

/**
 * 唱片基本信息:ALBUM_BASIC<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class AlbumBasicCrudServiceImpl extends BaseDBComponent implements AlbumBasicCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(AlbumBasicDto entity) {
        validate(entity);
        return getDao().update(AlbumBasicDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<AlbumBasicDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumBasicDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(AlbumBasicDto entity) {
        AlbumBasicDto existed = getDao().queryForObject(AlbumBasicDto.SQLID.FIND, entity, AlbumBasicDto.class);
        if (existed == null) {
            return getDao().update(AlbumBasicDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(AlbumBasicDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<AlbumBasicDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumBasicDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(AlbumBasicDto entity) {
        validate(entity);
        return getDao().update(AlbumBasicDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<AlbumBasicDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumBasicDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(AlbumBasicDto entity) {
        validate(entity);
        return getDao().update(AlbumBasicDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<AlbumBasicDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumBasicDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(AlbumBasicDto entity) {
        return getDao().update(AlbumBasicDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<AlbumBasicDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumBasicDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    public AlbumBasicDto find(AlbumBasicDto queryParam) {
        return getDao().queryForObject(AlbumBasicDto.SQLID.FIND, queryParam, AlbumBasicDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    public List<AlbumBasicDto> search(AlbumBasicDto condition) {
        return getDao().queryForObjectList(AlbumBasicDto.SQLID.SEARCH, condition, AlbumBasicDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    public List<AlbumBasicDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumBasicDto.SQLID.LIKE_SEARCH, condition, AlbumBasicDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    public List<AlbumBasicDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumBasicDto.SQLID.DYNA_SEARCH, condition, AlbumBasicDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumBasicCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(AlbumBasicDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumBasicDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
