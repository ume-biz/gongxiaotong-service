package cn.com.gxt.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.entity.ReqDto;

/*
 * 需求信息表:REQ CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface ReqCrudService {
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
    Integer create(ReqDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<ReqDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(ReqDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<ReqDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(ReqDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<ReqDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(ReqDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<ReqDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(ReqDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<ReqDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    ReqDto find(ReqDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<ReqDto> findList(ReqDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter describe by map
     * @return - matched entity instance list
     */
    List<ReqDto> findListLike(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param dynaCondition - dynamic query parameter describe by map
     * @return - matched entity instance list
     */
    List<ReqDto> findListMatch(Map<String, String> dynaCondition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
