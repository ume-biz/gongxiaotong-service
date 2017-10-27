package cn.com.gxt.sample.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.sample.entity.AlbumContributorDto;
import cn.com.gxt.sample.entity.crud.AlbumContributorCrudService;

/**
 * 唱片参与表演者:ALBUM_CONTRIBUTOR<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class AlbumContributorCrudServiceImpl extends BaseDBComponent implements AlbumContributorCrudService {
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(AlbumContributorDto entity) {
        validate(entity);
        return getDao().update(AlbumContributorDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(AlbumContributorDto entity) {
        AlbumContributorDto existed = getDao().queryForObject(AlbumContributorDto.SQLID.FIND, entity, AlbumContributorDto.class);
        if (existed == null) {
            return getDao().update(AlbumContributorDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(AlbumContributorDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(AlbumContributorDto entity) {
        validate(entity);
        return getDao().update(AlbumContributorDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(AlbumContributorDto entity) {
        validate(entity);
        return getDao().update(AlbumContributorDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(AlbumContributorDto entity) {
        return getDao().update(AlbumContributorDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<AlbumContributorDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (AlbumContributorDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    public AlbumContributorDto find(AlbumContributorDto queryParam) {
        return getDao().queryForObject(AlbumContributorDto.SQLID.FIND, queryParam, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    public List<AlbumContributorDto> search(AlbumContributorDto condition) {
        return getDao().queryForObjectList(AlbumContributorDto.SQLID.SEARCH, condition, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    public List<AlbumContributorDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumContributorDto.SQLID.LIKE_SEARCH, condition, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    public List<AlbumContributorDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(AlbumContributorDto.SQLID.DYNA_SEARCH, condition, AlbumContributorDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.sample.entity.crud.impl.AlbumContributorCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(AlbumContributorDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(AlbumContributorDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
