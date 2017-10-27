package cn.com.gxt.sample.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.sample.entity.AlbumContributorDto;

/*
 * 唱片参与表演者:ALBUM_CONTRIBUTOR<br>
 * Crud service interface declare.<br>
 *
 * @author DORA.Generator
 */
public interface AlbumContributorCrudService {
    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(AlbumContributorDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<AlbumContributorDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(AlbumContributorDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<AlbumContributorDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(AlbumContributorDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<AlbumContributorDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(AlbumContributorDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<AlbumContributorDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(AlbumContributorDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<AlbumContributorDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    AlbumContributorDto find(AlbumContributorDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumContributorDto> search(AlbumContributorDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumContributorDto> likeSearch(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<AlbumContributorDto> dynaSearch(Map<String, String> condition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
