
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
 * Entity class map to table "需求主信息"
 *
 * @author ume-team
 */
@Entity
@Table(name="REQ_MAIN")
@TableDesc(label="需求主信息")
public class ReqMainDto extends TableEntity implements Serializable {
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
    * 需求描述 
    */
    @Size(max=256)
    @ColumnDesc(index=2, type="VARCHAR", label="需求描述")
    @Column(name="REQ_DESC", nullable=true, length=256)
    private String reqDesc;

   /**
    * 期望发货时间 
    */
    @ColumnDesc(index=3, type="DATE", label="期望发货时间")
    @Column(name="REQ_DELIVERY_DATE", nullable=true)
    private java.sql.Date reqDeliveryDate;

   /**
    * 配送地址 
    */
    @NotEmpty
    @Size(max=256)
    @ColumnDesc(index=4, type="VARCHAR", label="配送地址")
    @Column(name="REQ_DELIVERY_ADDRESS", nullable=false, length=256)
    private String reqDeliveryAddress;

   /**
    * 联系电话 
    */
    @Size(max=16)
    @ColumnDesc(index=5, type="VARCHAR", label="联系电话")
    @Column(name="REQ_CONTACT_MOBILE", nullable=true, length=16)
    private String reqContactMobile;

   /**
    * 需求总价估算 
    * 单位:分
    */
    @ColumnDesc(index=6, type="INT", label="需求总价估算")
    @Column(name="REQ_TOTAL_ESTIMATION", nullable=true)
    private Integer reqTotalEstimation;

   /**
    * 最终报价编号 
    */
    @Size(max=32)
    @ColumnDesc(index=7, type="VARCHAR", label="最终报价编号")
    @Column(name="REQ_FINAL_BID_CODE", nullable=true, length=32)
    private String reqFinalBidCode;

   /**
    * 需求状态 
    * 10:需求发布
15:抢单确认 
25:支付失败 
26:支付成功 
100:全部完成
0:系统取消
    */
    @NotEmpty
    @ColumnDesc(index=8, type="INT", label="需求状态")
    @Column(name="REQ_STATUS", nullable=false)
    private Integer reqStatus;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(8 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(8 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(8 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(8 + 4), type="TIMESTAMP", label="updateDatetime")
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
     *　Get the "需求描述"
     */
    public String getReqDesc() {
        return this.reqDesc;
    }
    /**
     *　Set the "需求描述"
     */
    public void setReqDesc(
            String reqDesc) {
        this.reqDesc = reqDesc;
    }

    /**
     *　Get the "期望发货时间"
     */
    public java.sql.Date getReqDeliveryDate() {
        return this.reqDeliveryDate;
    }
    /**
     *　Set the "期望发货时间"
     */
    public void setReqDeliveryDate(
            java.sql.Date reqDeliveryDate) {
        this.reqDeliveryDate = reqDeliveryDate;
    }

    /**
     *　Get the "配送地址"
     */
    public String getReqDeliveryAddress() {
        return this.reqDeliveryAddress;
    }
    /**
     *　Set the "配送地址"
     */
    public void setReqDeliveryAddress(
            String reqDeliveryAddress) {
        this.reqDeliveryAddress = reqDeliveryAddress;
    }

    /**
     *　Get the "联系电话"
     */
    public String getReqContactMobile() {
        return this.reqContactMobile;
    }
    /**
     *　Set the "联系电话"
     */
    public void setReqContactMobile(
            String reqContactMobile) {
        this.reqContactMobile = reqContactMobile;
    }

    /**
     *　Get the "需求总价估算"
     */
    public Integer getReqTotalEstimation() {
        return this.reqTotalEstimation;
    }
    /**
     *　Set the "需求总价估算"
     */
    public void setReqTotalEstimation(
            Integer reqTotalEstimation) {
        this.reqTotalEstimation = reqTotalEstimation;
    }

    /**
     *　Get the "最终报价编号"
     */
    public String getReqFinalBidCode() {
        return this.reqFinalBidCode;
    }
    /**
     *　Set the "最终报价编号"
     */
    public void setReqFinalBidCode(
            String reqFinalBidCode) {
        this.reqFinalBidCode = reqFinalBidCode;
    }

    /**
     *　Get the "需求状态"
     */
    public Integer getReqStatus() {
        return this.reqStatus;
    }
    /**
     *　Set the "需求状态"
     */
    public void setReqStatus(
            Integer reqStatus) {
        this.reqStatus = reqStatus;
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
    public ReqMainDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ReqMainDto newInstance = new ReqMainDto();
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
        public static final String INSERT = "cn.com.gxt.entity.REQ_MAIN_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.REQ_MAIN_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.REQ_MAIN_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.REQ_MAIN_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.REQ_MAIN_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.REQ_MAIN_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.REQ_MAIN_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.REQ_MAIN_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.REQ_MAIN_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.REQ_MAIN_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCode = "reqCode";
        public static final String reqDesc = "reqDesc";
        public static final String reqDeliveryDate = "reqDeliveryDate";
        public static final String reqDeliveryAddress = "reqDeliveryAddress";
        public static final String reqContactMobile = "reqContactMobile";
        public static final String reqTotalEstimation = "reqTotalEstimation";
        public static final String reqFinalBidCode = "reqFinalBidCode";
        public static final String reqStatus = "reqStatus";
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
        public static final String REQ_DESC = "REQ_DESC";
        public static final String REQ_DELIVERY_DATE = "REQ_DELIVERY_DATE";
        public static final String REQ_DELIVERY_ADDRESS = "REQ_DELIVERY_ADDRESS";
        public static final String REQ_CONTACT_MOBILE = "REQ_CONTACT_MOBILE";
        public static final String REQ_TOTAL_ESTIMATION = "REQ_TOTAL_ESTIMATION";
        public static final String REQ_FINAL_BID_CODE = "REQ_FINAL_BID_CODE";
        public static final String REQ_STATUS = "REQ_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "REQ_MAIN";

}
