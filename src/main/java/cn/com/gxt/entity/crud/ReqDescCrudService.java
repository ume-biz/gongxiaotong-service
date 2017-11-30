package cn.com.gxt.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.entity.ReqDescDto;

/*
 * 需求描述属性表:REQ_DESC CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface ReqDescCrudService {
    /**
     * Enable/Disable operation history table automatic insert.<br>
     * 
     * @param enable the enable to set
     */
    void setEnableOperationHistory(boolean enable);

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(ReqDescDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<ReqDescDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(ReqDescDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<ReqDescDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(ReqDescDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<ReqDescDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(ReqDescDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<ReqDescDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(ReqDescDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<ReqDescDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    ReqDescDto find(ReqDescDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<ReqDescDto> findList(ReqDescDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter describe by map
     * @return - matched entity instance list
     */
    List<ReqDescDto> findListLike(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param dynaCondition - dynamic query parameter describe by map
     * @return - matched entity instance list
     */
    List<ReqDescDto> findListMatch(Map<String, String> dynaCondition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
