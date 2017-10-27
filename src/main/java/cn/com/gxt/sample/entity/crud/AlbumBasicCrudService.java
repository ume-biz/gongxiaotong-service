package cn.com.gxt.sample.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.sample.entity.AlbumBasicDto;

/*
 * 唱片基本信息:ALBUM_BASIC<br>
 * Crud service interface declare.<br>
 *
 * @author DORA.Generator
 */
public interface AlbumBasicCrudService {
    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(AlbumBasicDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<AlbumBasicDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(AlbumBasicDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<AlbumBasicDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(AlbumBasicDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<AlbumBasicDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(AlbumBasicDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<AlbumBasicDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(AlbumBasicDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<AlbumBasicDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    AlbumBasicDto find(AlbumBasicDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumBasicDto> search(AlbumBasicDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumBasicDto> likeSearch(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumBasicDto> dynaSearch(Map<String, String> condition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
