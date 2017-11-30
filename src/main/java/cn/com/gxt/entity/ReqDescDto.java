
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
 * Entity class map to table "需求描述属性表"
 *
 * @author ume-team
 */
@Entity
@Table(name="REQ_DESC")
@TableDesc(label="需求描述属性表")
public class ReqDescDto extends TableEntity implements Serializable {
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
    * 需求品类描述类型 
    * 0:自定义标签
1:枚举多选 
2:枚举单选
3:范围
9:图片描述
    */
    @NotEmpty
    @ColumnDesc(index=3, type="INT", label="需求品类描述类型")
    @Column(name="DESC_TYPE", nullable=false)
    private Integer descType;

   /**
    * 描述关键字 
    */
    @Size(max=32)
    @ColumnDesc(index=4, type="VARCHAR", label="描述关键字")
    @Column(name="DESC_TAG", nullable=true, length=32)
    private String descTag;

   /**
    * 描述文本内容 
    */
    @Size(max=512)
    @ColumnDesc(index=5, type="VARCHAR", label="描述文本内容")
    @Column(name="DESC_TEXT", nullable=true, length=512)
    private String descText;

   /**
    * 描述媒体内容 
    */
    @ColumnDesc(index=6, type="BLOB", label="描述媒体内容")
    @Column(name="DESC_MEDIA", nullable=true)
    private java.sql.Blob descMedia;

   /**
    * 需求品类描述类型 
    * 0:必须 1:可选
    */
    @ColumnDesc(index=7, type="INT", label="需求品类描述类型")
    @Column(name="OPTIONAL", nullable=true)
    private Integer optional;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(7 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(7 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(7 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(7 + 4), type="TIMESTAMP", label="updateDatetime")
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
     *　Get the "需求品类描述类型"
     */
    public Integer getDescType() {
        return this.descType;
    }
    /**
     *　Set the "需求品类描述类型"
     */
    public void setDescType(
            Integer descType) {
        this.descType = descType;
    }

    /**
     *　Get the "描述关键字"
     */
    public String getDescTag() {
        return this.descTag;
    }
    /**
     *　Set the "描述关键字"
     */
    public void setDescTag(
            String descTag) {
        this.descTag = descTag;
    }

    /**
     *　Get the "描述文本内容"
     */
    public String getDescText() {
        return this.descText;
    }
    /**
     *　Set the "描述文本内容"
     */
    public void setDescText(
            String descText) {
        this.descText = descText;
    }

    /**
     *　Get the "描述媒体内容"
     */
    public java.sql.Blob getDescMedia() {
        return this.descMedia;
    }
    /**
     *　Set the "描述媒体内容"
     */
    public void setDescMedia(
            java.sql.Blob descMedia) {
        this.descMedia = descMedia;
    }

    /**
     *　Get the "需求品类描述类型"
     */
    public Integer getOptional() {
        return this.optional;
    }
    /**
     *　Set the "需求品类描述类型"
     */
    public void setOptional(
            Integer optional) {
        this.optional = optional;
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
    public ReqDescDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ReqDescDto newInstance = new ReqDescDto();
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
        public static final String INSERT = "cn.com.gxt.entity.REQ_DESC_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.entity.REQ_DESC_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.entity.REQ_DESC_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.entity.REQ_DESC_DELETE"; 
        public static final String DELETE_ALL = "cn.com.gxt.entity.REQ_DESC_DELETE_ALL"; 
        public static final String FIND = "cn.com.gxt.entity.REQ_DESC_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.entity.REQ_DESC_FIND_FOR_UPDATE"; 
        public static final String FIND_LIST = "cn.com.gxt.entity.REQ_DESC_FIND_LIST"; 
        public static final String FIND_LIST_LIKE = "cn.com.gxt.entity.REQ_DESC_FIND_LIST_LIKE"; 
        public static final String FIND_LIST_MATCH = "cn.com.gxt.entity.REQ_DESC_FIND_LIST_MATCH"; 
        public static final String COUNT = "cn.com.gxt.entity.REQ_DESC_COUNT";
        public static final String INSERT_HISTORY_C = "cn.com.gxt.entity.REQ_DESC_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "cn.com.gxt.entity.REQ_DESC_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "cn.com.gxt.entity.REQ_DESC_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String reqCd = "reqCd";
        public static final String descSeq = "descSeq";
        public static final String descType = "descType";
        public static final String descTag = "descTag";
        public static final String descText = "descText";
        public static final String descMedia = "descMedia";
        public static final String optional = "optional";
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
        public static final String DESC_TYPE = "DESC_TYPE";
        public static final String DESC_TAG = "DESC_TAG";
        public static final String DESC_TEXT = "DESC_TEXT";
        public static final String DESC_MEDIA = "DESC_MEDIA";
        public static final String OPTIONAL = "OPTIONAL";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "REQ_DESC";

}
