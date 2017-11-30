
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
 * Entity class map to table "需求信息表"
 *
 * @author ume-team
 */
@Entity
@Table(name="REQ")
@TableDesc(label="需求信息表")
public class ReqDto extends TableEntity implements Serializable {
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
    @Column(name="REQ_CD", nullable=false, length=32)
    private String reqCd;

   /**
    * 物品编号 
    */
    @NotEmpty
    @Size(max=32)
    @ColumnDesc(index=2, type="VARCHAR", label="物品编号")
    @Column(name="PRODUCT_CD", nullable=false, length=32)
    private String productCd;

   /**
    * 物品规格 
    */
    @NotEmpty
    @Size(max=64)
    @ColumnDesc(index=3, type="VARCHAR", label="物品规格")
    @Column(name="PRODUCT_SPECS", nullable=false, length=64)
    private String productSpecs;

   /**
    * 物品数量 
    */
    @NotEmpty
    @ColumnDesc(index=4, type="INT", label="物品数量")
    @Column(name="PRODUCT_QUANTITY", nullable=false)
    private Integer productQuantity;

   /**
    * 期望价格 
    */
    @NotEmpty
    @ColumnDesc(index=5, type="INT", label="期望价格")
    @Column(name="PRODUCT_ESTIMATION", nullable=false)
    private Integer productEstimation;

   /**
    * 收货地址 
    */
    @NotEmpty
    @Size(max=256)
    @ColumnDesc(index=6, type="VARCHAR", label="收货地址")
    @Column(name="CONTACT_ADDRESS", nullable=false, length=256)
    private String contactAddress;

   /**
    * 收货联系人姓名 
    */
    @Size(max=32)
    @ColumnDesc(index=7, type="VARCHAR", label="收货联系人姓名")
    @Column(name="CONTACT_NAME", nullable=true, length=32)
    private String contactName;

   /**
    * 收货联系人电话 
    */
    @Size(max=16)
    @ColumnDesc(index=8, type="VARCHAR", label="收货联系人电话")
    @Column(name="CONTACT_PHONE", nullable=true, length=16)
    private String contactPhone;

   /**
    * 竞标有效期(开始) 
    */
    @ColumnDesc(index=9, type="TIMESTAMP", label="竞标有效期(开始)")
    @Column(name="BID_DATE_BEGIN", nullable=true)
    private java.sql.Timestamp bidDateBegin;

   /**
    * 竞标有效期(结束) 
    */
    @ColumnDesc(index=10, type="TIMESTAMP", label="竞标有效期(结束)")
    @Column(name="BID_DATE_END", nullable=true)
    private java.sql.Timestamp bidDateEnd;

   /**
    * 竞标最大候选数 
    */
    @ColumnDesc(index=11, type="INT", label="竞标最大候选数")
    @Column(name="BID_MAX_LIMIT", nullable=true)
    private Integer bidMaxLimit;

   /**
    * 竞标状态 
    * 10:需求发布
15:抢单确认 
25:支付失败 
26:支付成功 
100:确认完成
99:系统取消 
0:草稿
    */
    @NotEmpty
    @ColumnDesc(index=12, type="INT", label="竞标状态")
    @Column(name="BID_STATUS", nullable=false)
    private Integer bidStatus;

   /**
    * 最终竞标UID 
    */
    @Size(max=32)
    @ColumnDesc(index=13, type="VARCHAR", label="最终竞标UID")
    @Column(name="BID_UID", nullable=true, length=32)
    private String bidUid;

   /**
    * 最终竞标价格 
    */
    @ColumnDesc(index=14, type="INT", label="最终竞标价格")
    @Column(name="BID_PRICE", nullable=true)
    private Integer bidPrice;

   /**
    * 物流单号 
    */
    @Size(max=128)
    @ColumnDesc(index=15, type="VARCHAR", label="物流单号")
    @Column(name="LOGISTICS_CD", nullable=true, length=128)
    private String logisticsCd;

   /**
    * 物流描述 
    */
    @Size(max=512)
    @ColumnDesc(index=16, type="VARCHAR", label="物流描述")
    @Column(name="LOGISTICS_DESC", nullable=true, length=512)
    private String logisticsDesc;

   /**
    * 物流状态 
    * 35:发货
45:收货 
44:退货/退款
43:换货
    */
    @ColumnDesc(index=17, type="INT", label="物流状态")
    @Column(name="LOGISTICS_STATUS", nullable=true)
    private Integer logisticsStatus;

   /**
    * 备注 
    */
    @Size(max=512)
    @ColumnDesc(index=18, type="VARCHAR", label="备注")
    @Column(name="COMMENT", nullable=true, length=512)
    private String comment;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(18 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(18 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(18 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(18 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "需求编号"
     */
    public String getReqCd() {
        return this.reqCd;
    }
    /**
     *　Set the "需求编号"
     */
    public void setReqCd(
            String reqCd) {
        this.reqCd = reqCd;
    }

    /**
     *　Get the "物品编号"
     */
    public String getProductCd() {
        return this.productCd;
    }
    /**
     *　Set the "物品编号"
     */
    public void setProductCd(
            String productCd) {
        this.productCd = productCd;
    }

    /**
     *　Get the "物品规格"
     */
    public String getProductSpecs() {
        return this.productSpecs;
    }
    /**
     *　Set the "物品规格"
     */
    public void setProductSpecs(
            String productSpecs) {
        this.productSpecs = productSpecs;
    }

    /**
     *　Get the "物品数量"
     */
    public Integer getProductQuantity() {
        return this.productQuantity;
    }
    /**
     *　Set the "物品数量"
     */
    public void setProductQuantity(
            Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     *　Get the "期望价格"
     */
    public Integer getProductEstimation() {
        return this.productEstimation;
    }
    /**
     *　Set the "期望价格"
     */
    public void setProductEstimation(
            Integer productEstimation) {
        this.productEstimation = productEstimation;
    }

    /**
     *　Get the "收货地址"
     */
    public String getContactAddress() {
        return this.contactAddress;
    }
    /**
     *　Set the "收货地址"
     */
    public void setContactAddress(
            String contactAddress) {
        this.contactAddress = contactAddress;
    }

    /**
     *　Get the "收货联系人姓名"
     */
    public String getContactName() {
        return this.contactName;
    }
    /**
     *　Set the "收货联系人姓名"
     */
    public void setContactName(
            String contactName) {
        this.contactName = contactName;
    }

    /**
     *　Get the "收货联系人电话"
     */
    public String getContactPhone() {
        return this.contactPhone;
    }
    /**
     *　Set the "收货联系人电话"
     */
    public void setContactPhone(
            String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     *　Get the "竞标有效期(开始)"
     */
    public java.sql.Timestamp getBidDateBegin() {
        return this.bidDateBegin;
    }
    /**
     *　Set the "竞标有效期(开始)"
     */
    public void setBidDateBegin(
            java.sql.Timestamp bidDateBegin) {
        this.bidDateBegin = bidDateBegin;
    }

    /**
     *　Get the "竞标有效期(结束)"
     */
    public java.sql.Timestamp getBidDateEnd() {
        return this.bidDateEnd;
    }
    /**
     *　Set the "竞标有效期(结束)"
     */
    public void setBidDateEnd(
            java.sql.Timestamp bidDateEnd) {
        this.bidDateEnd = bidDateEnd;
    }

    /**
     *　Get the "竞标最大候选数"
     */
    public Integer getBidMaxLimit() {
        return this.bidMaxLimit;
    }
    /**
     *　Set the "竞标最大候选数"
     */
    public void setBidMaxLimit(
            Integer bidMaxLimit) {
        this.bidMaxLimit = bidMaxLimit;
    }

    /**
     *　Get the "竞标状态"
     */
    public Integer getBidStatus() {
        return this.bidStatus;
    }
    /**
     *　Set the "竞标状态"
     */
    public void setBidStatus(
            Integer bidStatus) {
        this.bidStatus = bidStatus;
    }

    /**
     *　Get the "最终竞标UID"
     */
    public String getBidUid() {
        return this.bidUid;
    }
    /**
     *　Set the "最终竞标UID"
     */
    public void setBidUid(
            String bidUid) {
        this.bidUid = bidUid;
    }

    /**
     *　Get the "最终竞标价格"
     */
    public Integer getBidPrice() {
        return this.bidPrice;
    }
    /**
     *　Set the "最终竞标价格"
     */
    public void setBidPrice(
            Integer bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     *　Get the "物流单号"
     */
    public String getLogisticsCd() {
        return this.logisticsCd;
    }
    /**
     *　Set the "物流单号"
     */
    public void setLogisticsCd(
            String logisticsCd) {
        this.logisticsCd = logisticsCd;
    }

    /**
     *　Get the "物流描述"
     */
    public String getLogisticsDesc() {
        return this.logisticsDesc;
    }
    /**
     *　Set the "物流描述"
     */
    public void setLogisticsDesc(
            String logisticsDesc) {
        this.logisticsDesc = logisticsDesc;
    }

    /**
     *　Get the "物流状态"
     */
    public Integer getLogisticsStatus() {
        return this.logisticsStatus;
    }
    /**
     *　Set the "物流状态"
     */
    public void setLogisticsStatus(
            Integer logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    /**
     *　Get the "备注"
     */
    public String getComment() {
        return this.comment;
    }
    /**
     *　Set the "备注"
     */
    public void setComment(
            String comment) {
        this.comment = comment;
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
    public ReqDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ReqDto newInstance = new ReqDto();
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
        public static final String INSERT = "cn.com.gxt.entity.REQ_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.REQ_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.REQ_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.REQ_DELETE"; 
        public static final String DELETE_ALL = "cn.com.gxt.entity.REQ_DELETE_ALL"; 
        public static final String FIND = "cn.com.gxt.entity.REQ_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.REQ_FIND_FOR_UPDATE"; 
        public static final String FIND_LIST = "cn.com.gxt.entity.REQ_FIND_LIST"; 
        public static final String FIND_LIST_LIKE = "cn.com.gxt.entity.REQ_FIND_LIST_LIKE"; 
        public static final String FIND_LIST_MATCH = "cn.com.gxt.entity.REQ_FIND_LIST_MATCH"; 
        public static final String COUNT = "cn.com.gxt.entity.REQ_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.REQ_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.REQ_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.REQ_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCd = "reqCd";
        public static final String productCd = "productCd";
        public static final String productSpecs = "productSpecs";
        public static final String productQuantity = "productQuantity";
        public static final String productEstimation = "productEstimation";
        public static final String contactAddress = "contactAddress";
        public static final String contactName = "contactName";
        public static final String contactPhone = "contactPhone";
        public static final String bidDateBegin = "bidDateBegin";
        public static final String bidDateEnd = "bidDateEnd";
        public static final String bidMaxLimit = "bidMaxLimit";
        public static final String bidStatus = "bidStatus";
        public static final String bidUid = "bidUid";
        public static final String bidPrice = "bidPrice";
        public static final String logisticsCd = "logisticsCd";
        public static final String logisticsDesc = "logisticsDesc";
        public static final String logisticsStatus = "logisticsStatus";
        public static final String comment = "comment";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String REQ_CD = "REQ_CD";
        public static final String PRODUCT_CD = "PRODUCT_CD";
        public static final String PRODUCT_SPECS = "PRODUCT_SPECS";
        public static final String PRODUCT_QUANTITY = "PRODUCT_QUANTITY";
        public static final String PRODUCT_ESTIMATION = "PRODUCT_ESTIMATION";
        public static final String CONTACT_ADDRESS = "CONTACT_ADDRESS";
        public static final String CONTACT_NAME = "CONTACT_NAME";
        public static final String CONTACT_PHONE = "CONTACT_PHONE";
        public static final String BID_DATE_BEGIN = "BID_DATE_BEGIN";
        public static final String BID_DATE_END = "BID_DATE_END";
        public static final String BID_MAX_LIMIT = "BID_MAX_LIMIT";
        public static final String BID_STATUS = "BID_STATUS";
        public static final String BID_UID = "BID_UID";
        public static final String BID_PRICE = "BID_PRICE";
        public static final String LOGISTICS_CD = "LOGISTICS_CD";
        public static final String LOGISTICS_DESC = "LOGISTICS_DESC";
        public static final String LOGISTICS_STATUS = "LOGISTICS_STATUS";
        public static final String COMMENT = "COMMENT";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "REQ";

}
