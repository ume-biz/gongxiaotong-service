package cn.com.gxt.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import cn.com.gxt.entity.ReqPubDto;
import cn.com.gxt.entity.crud.ReqPubCrudService;

/**
 * 需求汇总发布表:REQ_PUB CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class ReqPubCrudServiceImpl extends BaseDBComponent implements ReqPubCrudService {

    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(ReqPubDto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ReqPubDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ReqPubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqPubDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ReqPubDto entity) {
        ReqPubDto existed = super.getDao().queryForObject(ReqPubDto.SQLID.FIND, entity, ReqPubDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ReqPubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqPubDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(ReqPubDto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ReqPubDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ReqPubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqPubDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ReqPubDto entity) {
        validate(entity);
        int result = super.getDao().update(ReqPubDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ReqPubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqPubDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(ReqPubDto entity) {
        int result = super.getDao().update(ReqPubDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ReqPubDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ReqPubDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#find
     */
    @Override
    public ReqPubDto find(ReqPubDto queryParam) {
        return super.getDao().queryForObject(ReqPubDto.SQLID.FIND, queryParam, ReqPubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#findList
     */
    @Override
    public List<ReqPubDto> findList(ReqPubDto condition) {
        return super.getDao().queryForObjectList(ReqPubDto.SQLID.FIND_LIST, condition, ReqPubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#findListLike
     */
    @Override
    public List<ReqPubDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(ReqPubDto.SQLID.FIND_LIST_LIKE, condition, ReqPubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService#findListMatch
     */
    @Override
    public List<ReqPubDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(ReqPubDto.SQLID.FIND_LIST_MATCH, dynaCondition, ReqPubDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see cn.com.gxt.entity.crud.impl.ReqPubCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(ReqPubDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ReqPubDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
