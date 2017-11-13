
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
 * Entity class map to table "需求信息主表"
 *
 * @author ume-team
 */
@Entity
@Table(name="ORDER")
@TableDesc(label="需求信息主表")
public class OrderDto extends TableEntity implements Serializable {
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
    * 需求描述 
    */
    @Size(max=256)
    @ColumnDesc(index=2, type="VARCHAR", label="需求描述")
    @Column(name="ORDER_DESC", nullable=true, length=256)
    private String orderDesc;

   /**
    * 期望发货时间 
    */
    @ColumnDesc(index=3, type="DATE", label="期望发货时间")
    @Column(name="ORDER_DELIVERY_DATE", nullable=true)
    private java.sql.Date orderDeliveryDate;

   /**
    * 收货地址 
    */
    @NotEmpty
    @Size(max=256)
    @ColumnDesc(index=4, type="VARCHAR", label="收货地址")
    @Column(name="ORDER_DELIVERY_ADDRESS", nullable=false, length=256)
    private String orderDeliveryAddress;

   /**
    * 收货联系人姓名 
    */
    @Size(max=16)
    @ColumnDesc(index=5, type="VARCHAR", label="收货联系人姓名")
    @Column(name="ORDER_CONTACT_NAME", nullable=true, length=16)
    private String orderContactName;

   /**
    * 收货联系人电话 
    */
    @Size(max=16)
    @ColumnDesc(index=6, type="VARCHAR", label="收货联系人电话")
    @Column(name="ORDER_CONTACT_PHONE", nullable=true, length=16)
    private String orderContactPhone;

   /**
    * 需求总价估算 
    * 单位:分
    */
    @ColumnDesc(index=7, type="INT", label="需求总价估算")
    @Column(name="ORDER_TOTAL_ESTIMATION", nullable=true)
    private Integer orderTotalEstimation;

   /**
    * 需求状态 
    * 10:需求发布
15:抢单确认 
25:支付失败 
26:支付成功 
100:确认完成
0:系统取消
    */
    @NotEmpty
    @ColumnDesc(index=8, type="INT", label="需求状态")
    @Column(name="ORDER_STATUS", nullable=false)
    private Integer orderStatus;

   /**
    * 需求有效期(开始) 
    */
    @ColumnDesc(index=9, type="TIMESTAMP", label="需求有效期(开始)")
    @Column(name="ORDER_EFFECTIVE_BEGIN_DATE", nullable=true)
    private java.sql.Timestamp orderEffectiveBeginDate;

   /**
    * 需求有效期(结束) 
    */
    @ColumnDesc(index=10, type="TIMESTAMP", label="需求有效期(结束)")
    @Column(name="ORDER_EFFECTIVE_END_DATE", nullable=true)
    private java.sql.Timestamp orderEffectiveEndDate;

   /**
    * 最多候选竞标件数 
    */
    @ColumnDesc(index=11, type="INT", label="最多候选竞标件数")
    @Column(name="ORDER_BID_RECORD_LIMIT", nullable=true)
    private Integer orderBidRecordLimit;

   /**
    * 最终选定竞标者ID 
    */
    @Size(max=32)
    @ColumnDesc(index=12, type="VARCHAR", label="最终选定竞标者ID")
    @Column(name="ORDER_FINAL_BID_UID", nullable=true, length=32)
    private String orderFinalBidUid;

   /**
    * 最终选定方案描述 
    */
    @Size(max=256)
    @ColumnDesc(index=13, type="VARCHAR", label="最终选定方案描述")
    @Column(name="ORDER_FINAL_BID_DESC", nullable=true, length=256)
    private String orderFinalBidDesc;

   /**
    * 最终选定方案价格 
    */
    @ColumnDesc(index=14, type="INT", label="最终选定方案价格")
    @Column(name="ORDER_FINAL_BID_PRICE", nullable=true)
    private Integer orderFinalBidPrice;

   /**
    * 备注 
    */
    @Size(max=256)
    @ColumnDesc(index=15, type="VARCHAR", label="备注")
    @Column(name="ORDER_COMMENT", nullable=true, length=256)
    private String orderComment;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(15 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(15 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(15 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(15 + 4), type="TIMESTAMP", label="updateDatetime")
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
     *　Get the "需求描述"
     */
    public String getOrderDesc() {
        return this.orderDesc;
    }
    /**
     *　Set the "需求描述"
     */
    public void setOrderDesc(
            String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     *　Get the "期望发货时间"
     */
    public java.sql.Date getOrderDeliveryDate() {
        return this.orderDeliveryDate;
    }
    /**
     *　Set the "期望发货时间"
     */
    public void setOrderDeliveryDate(
            java.sql.Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    /**
     *　Get the "收货地址"
     */
    public String getOrderDeliveryAddress() {
        return this.orderDeliveryAddress;
    }
    /**
     *　Set the "收货地址"
     */
    public void setOrderDeliveryAddress(
            String orderDeliveryAddress) {
        this.orderDeliveryAddress = orderDeliveryAddress;
    }

    /**
     *　Get the "收货联系人姓名"
     */
    public String getOrderContactName() {
        return this.orderContactName;
    }
    /**
     *　Set the "收货联系人姓名"
     */
    public void setOrderContactName(
            String orderContactName) {
        this.orderContactName = orderContactName;
    }

    /**
     *　Get the "收货联系人电话"
     */
    public String getOrderContactPhone() {
        return this.orderContactPhone;
    }
    /**
     *　Set the "收货联系人电话"
     */
    public void setOrderContactPhone(
            String orderContactPhone) {
        this.orderContactPhone = orderContactPhone;
    }

    /**
     *　Get the "需求总价估算"
     */
    public Integer getOrderTotalEstimation() {
        return this.orderTotalEstimation;
    }
    /**
     *　Set the "需求总价估算"
     */
    public void setOrderTotalEstimation(
            Integer orderTotalEstimation) {
        this.orderTotalEstimation = orderTotalEstimation;
    }

    /**
     *　Get the "需求状态"
     */
    public Integer getOrderStatus() {
        return this.orderStatus;
    }
    /**
     *　Set the "需求状态"
     */
    public void setOrderStatus(
            Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     *　Get the "需求有效期(开始)"
     */
    public java.sql.Timestamp getOrderEffectiveBeginDate() {
        return this.orderEffectiveBeginDate;
    }
    /**
     *　Set the "需求有效期(开始)"
     */
    public void setOrderEffectiveBeginDate(
            java.sql.Timestamp orderEffectiveBeginDate) {
        this.orderEffectiveBeginDate = orderEffectiveBeginDate;
    }

    /**
     *　Get the "需求有效期(结束)"
     */
    public java.sql.Timestamp getOrderEffectiveEndDate() {
        return this.orderEffectiveEndDate;
    }
    /**
     *　Set the "需求有效期(结束)"
     */
    public void setOrderEffectiveEndDate(
            java.sql.Timestamp orderEffectiveEndDate) {
        this.orderEffectiveEndDate = orderEffectiveEndDate;
    }

    /**
     *　Get the "最多候选竞标件数"
     */
    public Integer getOrderBidRecordLimit() {
        return this.orderBidRecordLimit;
    }
    /**
     *　Set the "最多候选竞标件数"
     */
    public void setOrderBidRecordLimit(
            Integer orderBidRecordLimit) {
        this.orderBidRecordLimit = orderBidRecordLimit;
    }

    /**
     *　Get the "最终选定竞标者ID"
     */
    public String getOrderFinalBidUid() {
        return this.orderFinalBidUid;
    }
    /**
     *　Set the "最终选定竞标者ID"
     */
    public void setOrderFinalBidUid(
            String orderFinalBidUid) {
        this.orderFinalBidUid = orderFinalBidUid;
    }

    /**
     *　Get the "最终选定方案描述"
     */
    public String getOrderFinalBidDesc() {
        return this.orderFinalBidDesc;
    }
    /**
     *　Set the "最终选定方案描述"
     */
    public void setOrderFinalBidDesc(
            String orderFinalBidDesc) {
        this.orderFinalBidDesc = orderFinalBidDesc;
    }

    /**
     *　Get the "最终选定方案价格"
     */
    public Integer getOrderFinalBidPrice() {
        return this.orderFinalBidPrice;
    }
    /**
     *　Set the "最终选定方案价格"
     */
    public void setOrderFinalBidPrice(
            Integer orderFinalBidPrice) {
        this.orderFinalBidPrice = orderFinalBidPrice;
    }

    /**
     *　Get the "备注"
     */
    public String getOrderComment() {
        return this.orderComment;
    }
    /**
     *　Set the "备注"
     */
    public void setOrderComment(
            String orderComment) {
        this.orderComment = orderComment;
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
    public OrderDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        OrderDto newInstance = new OrderDto();
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
        public static final String INSERT = "cn.com.gxt.entity.ORDER_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.ORDER_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.ORDER_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.ORDER_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.ORDER_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.ORDER_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.ORDER_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.ORDER_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.ORDER_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.ORDER_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.ORDER_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.ORDER_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.ORDER_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String orderCode = "orderCode";
        public static final String orderDesc = "orderDesc";
        public static final String orderDeliveryDate = "orderDeliveryDate";
        public static final String orderDeliveryAddress = "orderDeliveryAddress";
        public static final String orderContactName = "orderContactName";
        public static final String orderContactPhone = "orderContactPhone";
        public static final String orderTotalEstimation = "orderTotalEstimation";
        public static final String orderStatus = "orderStatus";
        public static final String orderEffectiveBeginDate = "orderEffectiveBeginDate";
        public static final String orderEffectiveEndDate = "orderEffectiveEndDate";
        public static final String orderBidRecordLimit = "orderBidRecordLimit";
        public static final String orderFinalBidUid = "orderFinalBidUid";
        public static final String orderFinalBidDesc = "orderFinalBidDesc";
        public static final String orderFinalBidPrice = "orderFinalBidPrice";
        public static final String orderComment = "orderComment";
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
        public static final String ORDER_DESC = "ORDER_DESC";
        public static final String ORDER_DELIVERY_DATE = "ORDER_DELIVERY_DATE";
        public static final String ORDER_DELIVERY_ADDRESS = "ORDER_DELIVERY_ADDRESS";
        public static final String ORDER_CONTACT_NAME = "ORDER_CONTACT_NAME";
        public static final String ORDER_CONTACT_PHONE = "ORDER_CONTACT_PHONE";
        public static final String ORDER_TOTAL_ESTIMATION = "ORDER_TOTAL_ESTIMATION";
        public static final String ORDER_STATUS = "ORDER_STATUS";
        public static final String ORDER_EFFECTIVE_BEGIN_DATE = "ORDER_EFFECTIVE_BEGIN_DATE";
        public static final String ORDER_EFFECTIVE_END_DATE = "ORDER_EFFECTIVE_END_DATE";
        public static final String ORDER_BID_RECORD_LIMIT = "ORDER_BID_RECORD_LIMIT";
        public static final String ORDER_FINAL_BID_UID = "ORDER_FINAL_BID_UID";
        public static final String ORDER_FINAL_BID_DESC = "ORDER_FINAL_BID_DESC";
        public static final String ORDER_FINAL_BID_PRICE = "ORDER_FINAL_BID_PRICE";
        public static final String ORDER_COMMENT = "ORDER_COMMENT";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ORDER";

}
