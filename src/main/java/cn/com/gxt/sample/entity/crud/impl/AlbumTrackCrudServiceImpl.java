package cn.com.gxt.sample.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.sample.entity.AlbumTrackDto;
import cn.com.gxt.sample.entity.crud.AlbumTrackCrudService;

/**
 * 唱片曲目信息:ALBUM_TRACK<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class AlbumTrackCrudServiceImpl extends BaseDBComponent implements AlbumTrackCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(AlbumTrackDto entity) {
        validate(entity);
        return getDao().update(AlbumTrackDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(AlbumTrackDto entity) {
        AlbumTrackDto existed = getDao().queryForObject(AlbumTrackDto.SQLID.FIND, entity, AlbumTrackDto.class);
        if (existed == null) {
            return getDao().update(AlbumTrackDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(AlbumTrackDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(AlbumTrackDto entity) {
        validate(entity);
        return getDao().update(AlbumTrackDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(AlbumTrackDto entity) {
        validate(entity);
        return getDao().update(AlbumTrackDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(AlbumTrackDto entity) {
        return getDao().update(AlbumTrackDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<AlbumTrackDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumTrackDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    public AlbumTrackDto find(AlbumTrackDto queryParam) {
        return getDao().queryForObject(AlbumTrackDto.SQLID.FIND, queryParam, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    public List<AlbumTrackDto> search(AlbumTrackDto condition) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.SEARCH, condition, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    public List<AlbumTrackDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.LIKE_SEARCH, condition, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    public List<AlbumTrackDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumTrackDto.SQLID.DYNA_SEARCH, condition, AlbumTrackDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumTrackCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(AlbumTrackDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumTrackDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
