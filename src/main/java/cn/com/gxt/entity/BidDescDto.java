
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
 * Entity class map to table "抢单描述属性表"
 *
 * @author ume-team
 */
@Entity
@Table(name="BID_DESC")
@TableDesc(label="抢单描述属性表")
public class BidDescDto extends TableEntity implements Serializable {
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
    * 需求描述索引 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=2, type="INT", label="需求描述索引")
    @Column(name="DESC_SEQ", nullable=false)
    private Integer descSeq;

   /**
    * 竞标UID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=3, type="VARCHAR", label="竞标UID")
    @Column(name="BID_UID", nullable=false, length=32)
    private String bidUid;

   /**
    * 竞标品类编号 
    */
    @Size(max=512)
    @ColumnDesc(index=4, type="VARCHAR", label="竞标品类编号")
    @Column(name="BID_DESC_TEXT", nullable=true, length=512)
    private String bidDescText;

   /**
    * 竞标品类单价 
    */
    @ColumnDesc(index=5, type="BLOB", label="竞标品类单价")
    @Column(name="BID_DESC_MEDIA", nullable=true)
    private java.sql.Blob bidDescMedia;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(5 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(5 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(5 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(5 + 4), type="TIMESTAMP", label="updateDatetime")
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
     *　Get the "需求描述索引"
     */
    public Integer getDescSeq() {
        return this.descSeq;
    }
    /**
     *　Set the "需求描述索引"
     */
    public void setDescSeq(
            Integer descSeq) {
        this.descSeq = descSeq;
    }

    /**
     *　Get the "竞标UID"
     */
    public String getBidUid() {
        return this.bidUid;
    }
    /**
     *　Set the "竞标UID"
     */
    public void setBidUid(
            String bidUid) {
        this.bidUid = bidUid;
    }

    /**
     *　Get the "竞标品类编号"
     */
    public String getBidDescText() {
        return this.bidDescText;
    }
    /**
     *　Set the "竞标品类编号"
     */
    public void setBidDescText(
            String bidDescText) {
        this.bidDescText = bidDescText;
    }

    /**
     *　Get the "竞标品类单价"
     */
    public java.sql.Blob getBidDescMedia() {
        return this.bidDescMedia;
    }
    /**
     *　Set the "竞标品类单价"
     */
    public void setBidDescMedia(
            java.sql.Blob bidDescMedia) {
        this.bidDescMedia = bidDescMedia;
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
    public BidDescDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        BidDescDto newInstance = new BidDescDto();
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
        public static final String INSERT = "cn.com.gxt.entity.BID_DESC_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.BID_DESC_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.BID_DESC_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.BID_DESC_DELETE"; 
        public static final String DELETE_ALL = "cn.com.gxt.entity.BID_DESC_DELETE_ALL"; 
        public static final String FIND = "cn.com.gxt.entity.BID_DESC_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.BID_DESC_FIND_FOR_UPDATE"; 
        public static final String FIND_LIST = "cn.com.gxt.entity.BID_DESC_FIND_LIST"; 
        public static final String FIND_LIST_LIKE = "cn.com.gxt.entity.BID_DESC_FIND_LIST_LIKE"; 
        public static final String FIND_LIST_MATCH = "cn.com.gxt.entity.BID_DESC_FIND_LIST_MATCH"; 
        public static final String COUNT = "cn.com.gxt.entity.BID_DESC_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.BID_DESC_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.BID_DESC_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.BID_DESC_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCd = "reqCd";
        public static final String descSeq = "descSeq";
        public static final String bidUid = "bidUid";
        public static final String bidDescText = "bidDescText";
        public static final String bidDescMedia = "bidDescMedia";
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
        public static final String DESC_SEQ = "DESC_SEQ";
        public static final String BID_UID = "BID_UID";
        public static final String BID_DESC_TEXT = "BID_DESC_TEXT";
        public static final String BID_DESC_MEDIA = "BID_DESC_MEDIA";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "BID_DESC";

}
