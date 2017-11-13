
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
 * Entity class map to table "需求信息品类明细表"
 *
 * @author ume-team
 */
@Entity
@Table(name="ORDER_ITEM")
@TableDesc(label="需求信息品类明细表")
public class OrderItemDto extends TableEntity implements Serializable {
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
    * 品类项目编号 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=2, type="VARCHAR", label="品类项目编号")
    @Column(name="ORDER_ITEM_CODE", nullable=false, length=32)
    private String orderItemCode;

   /**
    * 品类项目描述 
    * JSON格式
    */
    @Size(max=256)
    @ColumnDesc(index=3, type="VARCHAR", label="品类项目描述")
    @Column(name="ORDER_ITEM_DESC", nullable=true, length=256)
    private String orderItemDesc;

   /**
    * 品类项目规格 
    */
    @Size(max=64)
    @ColumnDesc(index=4, type="VARCHAR", label="品类项目规格")
    @Column(name="ORDER_ITEM_SPECS", nullable=true, length=64)
    private String orderItemSpecs;

   /**
    * 品类项目数量 
    */
    @ColumnDesc(index=5, type="INT", label="品类项目数量")
    @Column(name="ORDER_ITEM_QUANTITY", nullable=true)
    private Integer orderItemQuantity;

   /**
    * 品类项目期望单价(MAX) 
    * 单位:分
    */
    @ColumnDesc(index=6, type="INT", label="品类项目期望单价(MAX)")
    @Column(name="ORDER_ITEM_ESTIMATION", nullable=true)
    private Integer orderItemEstimation;

   /**
    * 物流单号 
    */
    @Size(max=128)
    @ColumnDesc(index=7, type="VARCHAR", label="物流单号")
    @Column(name="ORDER_ITEM_LOGISTICS_CODE", nullable=true, length=128)
    private String orderItemLogisticsCode;

   /**
    * 物流描述/动态 
    */
    @Size(max=256)
    @ColumnDesc(index=8, type="VARCHAR", label="物流描述/动态")
    @Column(name="ORDER_ITEM_LOGISTICS_DESC", nullable=true, length=256)
    private String orderItemLogisticsDesc;

   /**
    * 物流签收状态 
    * 35:发货
45:收货 
44:退货/退款
43:换货
    */
    @ColumnDesc(index=9, type="INT", label="物流签收状态")
    @Column(name="ORDER_ITEM_ORDER_STATUS", nullable=true)
    private Integer orderItemOrderStatus;

   /**
    * 备注 
    */
    @Size(max=256)
    @ColumnDesc(index=10, type="VARCHAR", label="备注")
    @Column(name="ORDER_ITEM_COMMENT", nullable=true, length=256)
    private String orderItemComment;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(10 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(10 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(10 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(10 + 4), type="TIMESTAMP", label="updateDatetime")
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
     *　Get the "品类项目编号"
     */
    public String getOrderItemCode() {
        return this.orderItemCode;
    }
    /**
     *　Set the "品类项目编号"
     */
    public void setOrderItemCode(
            String orderItemCode) {
        this.orderItemCode = orderItemCode;
    }

    /**
     *　Get the "品类项目描述"
     */
    public String getOrderItemDesc() {
        return this.orderItemDesc;
    }
    /**
     *　Set the "品类项目描述"
     */
    public void setOrderItemDesc(
            String orderItemDesc) {
        this.orderItemDesc = orderItemDesc;
    }

    /**
     *　Get the "品类项目规格"
     */
    public String getOrderItemSpecs() {
        return this.orderItemSpecs;
    }
    /**
     *　Set the "品类项目规格"
     */
    public void setOrderItemSpecs(
            String orderItemSpecs) {
        this.orderItemSpecs = orderItemSpecs;
    }

    /**
     *　Get the "品类项目数量"
     */
    public Integer getOrderItemQuantity() {
        return this.orderItemQuantity;
    }
    /**
     *　Set the "品类项目数量"
     */
    public void setOrderItemQuantity(
            Integer orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    /**
     *　Get the "品类项目期望单价(MAX)"
     */
    public Integer getOrderItemEstimation() {
        return this.orderItemEstimation;
    }
    /**
     *　Set the "品类项目期望单价(MAX)"
     */
    public void setOrderItemEstimation(
            Integer orderItemEstimation) {
        this.orderItemEstimation = orderItemEstimation;
    }

    /**
     *　Get the "物流单号"
     */
    public String getOrderItemLogisticsCode() {
        return this.orderItemLogisticsCode;
    }
    /**
     *　Set the "物流单号"
     */
    public void setOrderItemLogisticsCode(
            String orderItemLogisticsCode) {
        this.orderItemLogisticsCode = orderItemLogisticsCode;
    }

    /**
     *　Get the "物流描述/动态"
     */
    public String getOrderItemLogisticsDesc() {
        return this.orderItemLogisticsDesc;
    }
    /**
     *　Set the "物流描述/动态"
     */
    public void setOrderItemLogisticsDesc(
            String orderItemLogisticsDesc) {
        this.orderItemLogisticsDesc = orderItemLogisticsDesc;
    }

    /**
     *　Get the "物流签收状态"
     */
    public Integer getOrderItemOrderStatus() {
        return this.orderItemOrderStatus;
    }
    /**
     *　Set the "物流签收状态"
     */
    public void setOrderItemOrderStatus(
            Integer orderItemOrderStatus) {
        this.orderItemOrderStatus = orderItemOrderStatus;
    }

    /**
     *　Get the "备注"
     */
    public String getOrderItemComment() {
        return this.orderItemComment;
    }
    /**
     *　Set the "备注"
     */
    public void setOrderItemComment(
            String orderItemComment) {
        this.orderItemComment = orderItemComment;
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
    public OrderItemDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        OrderItemDto newInstance = new OrderItemDto();
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
        public static final String INSERT = "cn.com.gxt.entity.ORDER_ITEM_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.ORDER_ITEM_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.ORDER_ITEM_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.ORDER_ITEM_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.ORDER_ITEM_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.ORDER_ITEM_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.ORDER_ITEM_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.ORDER_ITEM_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.ORDER_ITEM_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.ORDER_ITEM_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.ORDER_ITEM_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.ORDER_ITEM_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.ORDER_ITEM_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String orderCode = "orderCode";
        public static final String orderItemCode = "orderItemCode";
        public static final String orderItemDesc = "orderItemDesc";
        public static final String orderItemSpecs = "orderItemSpecs";
        public static final String orderItemQuantity = "orderItemQuantity";
        public static final String orderItemEstimation = "orderItemEstimation";
        public static final String orderItemLogisticsCode = "orderItemLogisticsCode";
        public static final String orderItemLogisticsDesc = "orderItemLogisticsDesc";
        public static final String orderItemOrderStatus = "orderItemOrderStatus";
        public static final String orderItemComment = "orderItemComment";
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
        public static final String ORDER_ITEM_DESC = "ORDER_ITEM_DESC";
        public static final String ORDER_ITEM_SPECS = "ORDER_ITEM_SPECS";
        public static final String ORDER_ITEM_QUANTITY = "ORDER_ITEM_QUANTITY";
        public static final String ORDER_ITEM_ESTIMATION = "ORDER_ITEM_ESTIMATION";
        public static final String ORDER_ITEM_LOGISTICS_CODE = "ORDER_ITEM_LOGISTICS_CODE";
        public static final String ORDER_ITEM_LOGISTICS_DESC = "ORDER_ITEM_LOGISTICS_DESC";
        public static final String ORDER_ITEM_ORDER_STATUS = "ORDER_ITEM_ORDER_STATUS";
        public static final String ORDER_ITEM_COMMENT = "ORDER_ITEM_COMMENT";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ORDER_ITEM";

}
