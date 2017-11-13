
package cn.com.gxt.entity;

import java.io.Serializable;
import org.umeframework.dora.validation.constraints.Size;
import org.umeframework.dora.type.ColumnDesc;
import org.umeframework.dora.validation.constraints.NotEmpty;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.umeframework.dora.type.TableDesc;
import javax.persistence.Id;
import org.umeframework.dora.bean.BeanUtil;
import org.umeframework.dora.service.TableEntity;

/**
 * Entity class map to table "需求信息品类属性描述表"
 *
 * @author ume-team
 */
@Entity
@Table(name="ORDER_ITEM_PROP")
@TableDesc(label="需求信息品类属性描述表")
public class OrderItemPropDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 需求编号 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="需求编号")
    @Column(name="ORDER_CODE", nullable=false, length=32)
    private String orderCode;

   /**
    * 品类编号 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=2, type="VARCHAR", label="品类编号")
    @Column(name="ORDER_ITEM_CODE", nullable=false, length=32)
    private String orderItemCode;

   /**
    * 品类项目属性KEY 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=3, type="VARCHAR", label="品类项目属性KEY")
    @Column(name="ORDER_ITEM_PROP_KEY", nullable=false, length=32)
    private String orderItemPropKey;

   /**
    * 品类项目属性VALUE 
    */
    @Size(max=64)
    @ColumnDesc(index=4, type="VARCHAR", label="品类项目属性VALUE")
    @Column(name="ORDER_ITEM_PROP_VALUE", nullable=true, length=64)
    private String orderItemPropValue;

   /**
    * 品类项目属性可选标识 
    * 1:必须 0:可选
    */
    @ColumnDesc(index=5, type="INT", label="品类项目属性可选标识")
    @Column(name="ORDER_ITEM_PROP_OPTION", nullable=true)
    private Integer orderItemPropOption;

   /**
    * 品类项目属性INDEX 
    */
    @ColumnDesc(index=6, type="INT", label="品类项目属性INDEX")
    @Column(name="ORDER_ITEM_PROP_INDEX", nullable=true)
    private Integer orderItemPropIndex;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(6 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(6 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(6 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(6 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "需求编号"
     */
    public String getOrderCode() {
        return this.orderCode;
    }
    /**
     *　Set the "需求编号"
     */
    public void setOrderCode(
            String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     *　Get the "品类编号"
     */
    public String getOrderItemCode() {
        return this.orderItemCode;
    }
    /**
     *　Set the "品类编号"
     */
    public void setOrderItemCode(
            String orderItemCode) {
        this.orderItemCode = orderItemCode;
    }

    /**
     *　Get the "品类项目属性KEY"
     */
    public String getOrderItemPropKey() {
        return this.orderItemPropKey;
    }
    /**
     *　Set the "品类项目属性KEY"
     */
    public void setOrderItemPropKey(
            String orderItemPropKey) {
        this.orderItemPropKey = orderItemPropKey;
    }

    /**
     *　Get the "品类项目属性VALUE"
     */
    public String getOrderItemPropValue() {
        return this.orderItemPropValue;
    }
    /**
     *　Set the "品类项目属性VALUE"
     */
    public void setOrderItemPropValue(
            String orderItemPropValue) {
        this.orderItemPropValue = orderItemPropValue;
    }

    /**
     *　Get the "品类项目属性可选标识"
     */
    public Integer getOrderItemPropOption() {
        return this.orderItemPropOption;
    }
    /**
     *　Set the "品类项目属性可选标识"
     */
    public void setOrderItemPropOption(
            Integer orderItemPropOption) {
        this.orderItemPropOption = orderItemPropOption;
    }

    /**
     *　Get the "品类项目属性INDEX"
     */
    public Integer getOrderItemPropIndex() {
        return this.orderItemPropIndex;
    }
    /**
     *　Set the "品类项目属性INDEX"
     */
    public void setOrderItemPropIndex(
            Integer orderItemPropIndex) {
        this.orderItemPropIndex = orderItemPropIndex;
    }

    /**
     * Get the "Create Auther"
     */
    public String getCreateAuthor() {
        return createAuthor;
    }
    /**
     * Set the "Create Auther"
     */
    public void setCreateAuthor(
            String createAuthor) {
        this.createAuthor = createAuthor;
    }

    /**
     * Get the "Create Datetime"
     */
    public java.sql.Timestamp getCreateDatetime() {
        return createDatetime;
    }
    /**
     * Set the "Create Datetime"
     */
    public void setCreateDatetime(
            java.sql.Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * Get the "Update Auther"
     */
    public String getUpdateAuthor() {
        return updateAuthor;
    }
    /**
     * Set the "Update Auther"
     */
    public void setUpdateAuthor(
            String updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    /**
     * Get the "Update Datetime"
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return updateDatetime;
    }
    /**
     * Set the "Update Datetime"
     */
    public void setUpdateDatetime(
            java.sql.Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * Create bean instance copy with selected properties
     * 
     * @param selectProperties
     *            - properties which copy to new instance
     * @return
     */
    public OrderItemPropDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        OrderItemPropDto newInstance = new OrderItemPropDto();
        for (Property property : selectProperties) {
            String name = property.toString();
            Object value = BeanUtil.getBeanProperty(this, name);
            BeanUtil.setBeanProperty(newInstance, name, value);
        }
        return newInstance;
    }
    
    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String INSERT = "cn.com.gxt.entity.ORDER_ITEM_PROP_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.ORDER_ITEM_PROP_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.ORDER_ITEM_PROP_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.ORDER_ITEM_PROP_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.ORDER_ITEM_PROP_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.ORDER_ITEM_PROP_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.ORDER_ITEM_PROP_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.ORDER_ITEM_PROP_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.ORDER_ITEM_PROP_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.ORDER_ITEM_PROP_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.ORDER_ITEM_PROP_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.ORDER_ITEM_PROP_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.ORDER_ITEM_PROP_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String orderCode = "orderCode";
        public static final String orderItemCode = "orderItemCode";
        public static final String orderItemPropKey = "orderItemPropKey";
        public static final String orderItemPropValue = "orderItemPropValue";
        public static final String orderItemPropOption = "orderItemPropOption";
        public static final String orderItemPropIndex = "orderItemPropIndex";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String ORDER_CODE = "ORDER_CODE";
        public static final String ORDER_ITEM_CODE = "ORDER_ITEM_CODE";
        public static final String ORDER_ITEM_PROP_KEY = "ORDER_ITEM_PROP_KEY";
        public static final String ORDER_ITEM_PROP_VALUE = "ORDER_ITEM_PROP_VALUE";
        public static final String ORDER_ITEM_PROP_OPTION = "ORDER_ITEM_PROP_OPTION";
        public static final String ORDER_ITEM_PROP_INDEX = "ORDER_ITEM_PROP_INDEX";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ORDER_ITEM_PROP";

}
