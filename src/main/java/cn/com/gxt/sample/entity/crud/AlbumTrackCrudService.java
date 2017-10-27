package cn.com.gxt.sample.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.sample.entity.AlbumTrackDto;

/*
 * 唱片曲目信息:ALBUM_TRACK<br>
 * Crud service interface declare.<br>
 *
 * @author DORA.Generator
 */
public interface AlbumTrackCrudService {
    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(AlbumTrackDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<AlbumTrackDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(AlbumTrackDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<AlbumTrackDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(AlbumTrackDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<AlbumTrackDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(AlbumTrackDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<AlbumTrackDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(AlbumTrackDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<AlbumTrackDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    AlbumTrackDto find(AlbumTrackDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumTrackDto> search(AlbumTrackDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumTrackDto> likeSearch(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumTrackDto> dynaSearch(Map<String, String> condition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
