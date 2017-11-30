package cn.com.gxt.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.entity.ReqPubDto;

/*
 * 需求汇总发布表:REQ_PUB CRUD service interface declare.<br>
 *
 * @author UME-Generator
 */
public interface ReqPubCrudService {

    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(ReqPubDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<ReqPubDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(ReqPubDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<ReqPubDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(ReqPubDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<ReqPubDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(ReqPubDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<ReqPubDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(ReqPubDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<ReqPubDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    ReqPubDto find(ReqPubDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter describe by entity
     * @return - matched entity instance list
     */
    List<ReqPubDto> findList(ReqPubDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter describe by map
     * @return - matched entity instance list
     */
    List<ReqPubDto> findListLike(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param dynaCondition - dynamic query parameter describe by map
     * @return - matched entity instance list
     */
    List<ReqPubDto> findListMatch(Map<String, String> dynaCondition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
