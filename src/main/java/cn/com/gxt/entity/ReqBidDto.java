
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
 * Entity class map to table "需求竞标信息表"
 *
 * @author ume-team
 */
@Entity
@Table(name="REQ_BID")
@TableDesc(label="需求竞标信息表")
public class ReqBidDto extends TableEntity implements Serializable {
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
    * 竞标编号 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=2, type="VARCHAR", label="竞标编号")
    @Column(name="BID_CODE", nullable=false, length=32)
    private String bidCode;

   /**
    * 竞标描述 
    */
    @Size(max=256)
    @ColumnDesc(index=3, type="VARCHAR", label="竞标描述")
    @Column(name="BID_DESC", nullable=true, length=256)
    private String bidDesc;

   /**
    * 竞标报价 
    * 单位:分
    */
    @ColumnDesc(index=4, type="INT", label="竞标报价")
    @Column(name="BID_PRICE", nullable=true)
    private Integer bidPrice;

   /**
    * 竞标人/机构 
    */
    @Size(max=128)
    @ColumnDesc(index=5, type="VARCHAR", label="竞标人/机构")
    @Column(name="BID_OWNER", nullable=true, length=128)
    private String bidOwner;

   /**
    * 联系电话 
    */
    @Size(max=16)
    @ColumnDesc(index=6, type="VARCHAR", label="联系电话")
    @Column(name="BID_OWNER_MOBILE", nullable=true, length=16)
    private String bidOwnerMobile;

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
     *　Get the "竞标编号"
     */
    public String getBidCode() {
        return this.bidCode;
    }
    /**
     *　Set the "竞标编号"
     */
    public void setBidCode(
            String bidCode) {
        this.bidCode = bidCode;
    }

    /**
     *　Get the "竞标描述"
     */
    public String getBidDesc() {
        return this.bidDesc;
    }
    /**
     *　Set the "竞标描述"
     */
    public void setBidDesc(
            String bidDesc) {
        this.bidDesc = bidDesc;
    }

    /**
     *　Get the "竞标报价"
     */
    public Integer getBidPrice() {
        return this.bidPrice;
    }
    /**
     *　Set the "竞标报价"
     */
    public void setBidPrice(
            Integer bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     *　Get the "竞标人/机构"
     */
    public String getBidOwner() {
        return this.bidOwner;
    }
    /**
     *　Set the "竞标人/机构"
     */
    public void setBidOwner(
            String bidOwner) {
        this.bidOwner = bidOwner;
    }

    /**
     *　Get the "联系电话"
     */
    public String getBidOwnerMobile() {
        return this.bidOwnerMobile;
    }
    /**
     *　Set the "联系电话"
     */
    public void setBidOwnerMobile(
            String bidOwnerMobile) {
        this.bidOwnerMobile = bidOwnerMobile;
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
    public ReqBidDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ReqBidDto newInstance = new ReqBidDto();
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
        public static final String INSERT = "cn.com.gxt.entity.REQ_BID_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.REQ_BID_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.REQ_BID_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.REQ_BID_DELETE"; 
        public static final String FIND = "cn.com.gxt.entity.REQ_BID_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.REQ_BID_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.entity.REQ_BID_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.entity.REQ_BID_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.entity.REQ_BID_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.entity.REQ_BID_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCode = "reqCode";
        public static final String bidCode = "bidCode";
        public static final String bidDesc = "bidDesc";
        public static final String bidPrice = "bidPrice";
        public static final String bidOwner = "bidOwner";
        public static final String bidOwnerMobile = "bidOwnerMobile";
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
        public static final String BID_CODE = "BID_CODE";
        public static final String BID_DESC = "BID_DESC";
        public static final String BID_PRICE = "BID_PRICE";
        public static final String BID_OWNER = "BID_OWNER";
        public static final String BID_OWNER_MOBILE = "BID_OWNER_MOBILE";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "REQ_BID";

}
