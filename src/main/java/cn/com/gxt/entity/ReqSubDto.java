
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
 * Entity class map to table "需求品类明细信息"
 *
 * @author ume-team
 */
@Entity
@Table(name="REQ_SUB")
@TableDesc(label="需求品类明细信息")
public class ReqSubDto extends TableEntity implements Serializable {
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
    @Column(name="REQ_CODE", nullable=false, length=32)
    private String reqCode;

   /**
    * 品类编号 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=2, type="INT", label="品类编号")
    @Column(name="REQ_SUB_SEQ", nullable=false)
    private Integer reqSubSeq;

   /**
    * 品类编号 
    */
    @Size(max=32)
    @ColumnDesc(index=3, type="VARCHAR", label="品类编号")
    @Column(name="PRODUCT_CODE", nullable=true, length=32)
    private String productCode;

   /**
    * 品类描述 
    */
    @Size(max=256)
    @ColumnDesc(index=4, type="VARCHAR", label="品类描述")
    @Column(name="PRODUCT_DESC", nullable=true, length=256)
    private String productDesc;

   /**
    * 规格 
    */
    @Size(max=64)
    @ColumnDesc(index=5, type="VARCHAR", label="规格")
    @Column(name="PRODUCT_SPECS", nullable=true, length=64)
    private String productSpecs;

   /**
    * 数量 
    */
    @ColumnDesc(index=6, type="INT", label="数量")
    @Column(name="QUANTITY", nullable=true)
    private Integer quantity;

   /**
    * 期望单价(MAX) 
    * 单位:分
    */
    @ColumnDesc(index=7, type="INT", label="期望单价(MAX)")
    @Column(name="ESTIMATION", nullable=true)
    private Integer estimation;

   /**
    * 物流单号 
    */
    @Size(max=128)
    @ColumnDesc(index=8, type="VARCHAR", label="物流单号")
    @Column(name="LOGISTICS_CODE", nullable=true, length=128)
    private String logisticsCode;

   /**
    * 物流描述/动态 
    */
    @Size(max=256)
    @ColumnDesc(index=9, type="VARCHAR", label="物流描述/动态")
    @Column(name="LOGISTICS_DESC", nullable=true, length=256)
    private String logisticsDesc;

   /**
    * 物流签收状态 
    * 35:发货
45:收货 
44:退货/退款
43:换货
    */
    @ColumnDesc(index=10, type="INT", label="物流签收状态")
    @Column(name="REQ_SUB_STATUS", nullable=true)
    private Integer reqSubStatus;

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
    public String getReqCode() {
        return this.reqCode;
    }
    /**
     *　Set the "需求编号"
     */
    public void setReqCode(
            String reqCode) {
        this.reqCode = reqCode;
    }

    /**
     *　Get the "品类编号"
     */
    public Integer getReqSubSeq() {
        return this.reqSubSeq;
    }
    /**
     *　Set the "品类编号"
     */
    public void setReqSubSeq(
            Integer reqSubSeq) {
        this.reqSubSeq = reqSubSeq;
    }

    /**
     *　Get the "品类编号"
     */
    public String getProductCode() {
        return this.productCode;
    }
    /**
     *　Set the "品类编号"
     */
    public void setProductCode(
            String productCode) {
        this.productCode = productCode;
    }

    /**
     *　Get the "品类描述"
     */
    public String getProductDesc() {
        return this.productDesc;
    }
    /**
     *　Set the "品类描述"
     */
    public void setProductDesc(
            String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     *　Get the "规格"
     */
    public String getProductSpecs() {
        return this.productSpecs;
    }
    /**
     *　Set the "规格"
     */
    public void setProductSpecs(
            String productSpecs) {
        this.productSpecs = productSpecs;
    }

    /**
     *　Get the "数量"
     */
    public Integer getQuantity() {
        return this.quantity;
    }
    /**
     *　Set the "数量"
     */
    public void setQuantity(
            Integer quantity) {
        this.quantity = quantity;
    }

    /**
     *　Get the "期望单价(MAX)"
     */
    public Integer getEstimation() {
        return this.estimation;
    }
    /**
     *　Set the "期望单价(MAX)"
     */
    public void setEstimation(
            Integer estimation) {
        this.estimation = estimation;
    }

    /**
     *　Get the "物流单号"
     */
    public String getLogisticsCode() {
        return this.logisticsCode;
    }
    /**
     *　Set the "物流单号"
     */
    public void setLogisticsCode(
            String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    /**
     *　Get the "物流描述/动态"
     */
    public String getLogisticsDesc() {
        return this.logisticsDesc;
    }
    /**
     *　Set the "物流描述/动态"
     */
    public void setLogisticsDesc(
            String logisticsDesc) {
        this.logisticsDesc = logisticsDesc;
    }

    /**
     *　Get the "物流签收状态"
     */
    public Integer getReqSubStatus() {
        return this.reqSubStatus;
    }
    /**
     *　Set the "物流签收状态"
     */
    public void setReqSubStatus(
            Integer reqSubStatus) {
        this.reqSubStatus = reqSubStatus;
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
    public ReqSubDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ReqSubDto newInstance = new ReqSubDto();
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
        public static final String INSERT = "cn.com.gxt.entity.REQ_SUB_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.REQ_SUB_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.REQ_SUB_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.REQ_SUB_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.REQ_SUB_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.REQ_SUB_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.REQ_SUB_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.REQ_SUB_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.REQ_SUB_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.REQ_SUB_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCode = "reqCode";
        public static final String reqSubSeq = "reqSubSeq";
        public static final String productCode = "productCode";
        public static final String productDesc = "productDesc";
        public static final String productSpecs = "productSpecs";
        public static final String quantity = "quantity";
        public static final String estimation = "estimation";
        public static final String logisticsCode = "logisticsCode";
        public static final String logisticsDesc = "logisticsDesc";
        public static final String reqSubStatus = "reqSubStatus";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String REQ_CODE = "REQ_CODE";
        public static final String REQ_SUB_SEQ = "REQ_SUB_SEQ";
        public static final String PRODUCT_CODE = "PRODUCT_CODE";
        public static final String PRODUCT_DESC = "PRODUCT_DESC";
        public static final String PRODUCT_SPECS = "PRODUCT_SPECS";
        public static final String QUANTITY = "QUANTITY";
        public static final String ESTIMATION = "ESTIMATION";
        public static final String LOGISTICS_CODE = "LOGISTICS_CODE";
        public static final String LOGISTICS_DESC = "LOGISTICS_DESC";
        public static final String REQ_SUB_STATUS = "REQ_SUB_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "REQ_SUB";

}
