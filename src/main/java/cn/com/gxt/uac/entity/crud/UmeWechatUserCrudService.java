package cn.com.gxt.uac.entity.crud;

import java.util.List;
import java.util.Map;
import cn.com.gxt.uac.entity.UmeWechatUserDto;

/*
 * 微信用户基础属性表:UME_WECHAT_USER<br>
 * Crud service interface declare.<br>
 *
 * @author DORA.Generator
 */
public interface UmeWechatUserCrudService {
    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(UmeWechatUserDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<UmeWechatUserDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(UmeWechatUserDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<UmeWechatUserDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(UmeWechatUserDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<UmeWechatUserDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(UmeWechatUserDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<UmeWechatUserDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(UmeWechatUserDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<UmeWechatUserDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    UmeWechatUserDto find(UmeWechatUserDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<UmeWechatUserDto> search(UmeWechatUserDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<UmeWechatUserDto> likeSearch(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<UmeWechatUserDto> dynaSearch(Map<String, String> condition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
