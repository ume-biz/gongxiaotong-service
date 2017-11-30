
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
 * Entity class map to table "抢单信息表"
 *
 * @author ume-team
 */
@Entity
@Table(name="BID")
@TableDesc(label="抢单信息表")
public class BidDto extends TableEntity implements Serializable {
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
    * 抢单UID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=2, type="VARCHAR", label="抢单UID")
    @Column(name="BID_UID", nullable=false, length=32)
    private String bidUid;

   /**
    * 抢单报价 
    * 单位:分
    */
    @ColumnDesc(index=3, type="INT", label="抢单报价")
    @Column(name="BID_PRICE", nullable=true)
    private Integer bidPrice;

   /**
    * 抢单联系人姓名 
    */
    @Size(max=32)
    @ColumnDesc(index=4, type="VARCHAR", label="抢单联系人姓名")
    @Column(name="BID_CONTACT_NAME", nullable=true, length=32)
    private String bidContactName;

   /**
    * 抢单联系人电话 
    */
    @Size(max=16)
    @ColumnDesc(index=5, type="VARCHAR", label="抢单联系人电话")
    @Column(name="BID_CONTACT_PHONE", nullable=true, length=16)
    private String bidContactPhone;

   /**
    * 抢单状态 
    * 1:抢单中 2:抢单成功 0:抢单失败
    */
    @ColumnDesc(index=6, type="INT", label="抢单状态")
    @Column(name="BID_STATUS", nullable=true)
    private Integer bidStatus;

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
     *　Get the "抢单UID"
     */
    public String getBidUid() {
        return this.bidUid;
    }
    /**
     *　Set the "抢单UID"
     */
    public void setBidUid(
            String bidUid) {
        this.bidUid = bidUid;
    }

    /**
     *　Get the "抢单报价"
     */
    public Integer getBidPrice() {
        return this.bidPrice;
    }
    /**
     *　Set the "抢单报价"
     */
    public void setBidPrice(
            Integer bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     *　Get the "抢单联系人姓名"
     */
    public String getBidContactName() {
        return this.bidContactName;
    }
    /**
     *　Set the "抢单联系人姓名"
     */
    public void setBidContactName(
            String bidContactName) {
        this.bidContactName = bidContactName;
    }

    /**
     *　Get the "抢单联系人电话"
     */
    public String getBidContactPhone() {
        return this.bidContactPhone;
    }
    /**
     *　Set the "抢单联系人电话"
     */
    public void setBidContactPhone(
            String bidContactPhone) {
        this.bidContactPhone = bidContactPhone;
    }

    /**
     *　Get the "抢单状态"
     */
    public Integer getBidStatus() {
        return this.bidStatus;
    }
    /**
     *　Set the "抢单状态"
     */
    public void setBidStatus(
            Integer bidStatus) {
        this.bidStatus = bidStatus;
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
    public BidDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        BidDto newInstance = new BidDto();
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
        public static final String INSERT = "cn.com.gxt.entity.BID_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.BID_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.BID_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.BID_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.BID_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.BID_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.BID_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.BID_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.BID_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.BID_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.BID_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.BID_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.BID_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCd = "reqCd";
        public static final String bidUid = "bidUid";
        public static final String bidPrice = "bidPrice";
        public static final String bidContactName = "bidContactName";
        public static final String bidContactPhone = "bidContactPhone";
        public static final String bidStatus = "bidStatus";
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
        public static final String BID_UID = "BID_UID";
        public static final String BID_PRICE = "BID_PRICE";
        public static final String BID_CONTACT_NAME = "BID_CONTACT_NAME";
        public static final String BID_CONTACT_PHONE = "BID_CONTACT_PHONE";
        public static final String BID_STATUS = "BID_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "BID";

}
