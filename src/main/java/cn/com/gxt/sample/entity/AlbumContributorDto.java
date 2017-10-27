
package cn.com.gxt.sample.entity;

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
 * Entity class map to table "唱片参与表演者"
 *
 * @author ume-team
 */
@Entity
@Table(name="ALBUM_CONTRIBUTOR")
@TableDesc(label="唱片参与表演者")
public class AlbumContributorDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 唱片编号 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=1, type="INT", label="唱片编号")
    @Column(name="ALBUM_CODE", nullable=false)
    private Long albumCode;

   /**
    * 参与创作者 
    */
    @NotEmpty
    @Size(max=64)
    @Id
    @ColumnDesc(index=2, type="VARCHAR", label="参与创作者")
    @Column(name="CONTRIBUTOR", nullable=false, length=64)
    private String contributor;

   /**
    * 参与曲目 
    */
    @NotEmpty
    @Size(max=128)
    @Id
    @ColumnDesc(index=3, type="VARCHAR", label="参与曲目")
    @Column(name="CONTRIBUTED_TRACK", nullable=false, length=128)
    private String contributedTrack;

   /**
    * 备注 
    */
    @Size(max=128)
    @ColumnDesc(index=4, type="VARCHAR", label="备注")
    @Column(name="REMARK", nullable=true, length=128)
    private String remark;

   /**
    * Create Author (default setting while insert)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(4 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(4 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(4 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(4 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "唱片编号"
     */
    public Long getAlbumCode() {
        return this.albumCode;
    }
    /**
     *　Set the "唱片编号"
     */
    public void setAlbumCode(
            Long albumCode) {
        this.albumCode = albumCode;
    }

    /**
     *　Get the "参与创作者"
     */
    public String getContributor() {
        return this.contributor;
    }
    /**
     *　Set the "参与创作者"
     */
    public void setContributor(
            String contributor) {
        this.contributor = contributor;
    }

    /**
     *　Get the "参与曲目"
     */
    public String getContributedTrack() {
        return this.contributedTrack;
    }
    /**
     *　Set the "参与曲目"
     */
    public void setContributedTrack(
            String contributedTrack) {
        this.contributedTrack = contributedTrack;
    }

    /**
     *　Get the "备注"
     */
    public String getRemark() {
        return this.remark;
    }
    /**
     *　Set the "备注"
     */
    public void setRemark(
            String remark) {
        this.remark = remark;
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
    public AlbumContributorDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        AlbumContributorDto newInstance = new AlbumContributorDto();
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
        public static final String INSERT = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_DELETE"; 
        public static final String FIND = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.sample.entity.ALBUM_CONTRIBUTOR_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String albumCode = "albumCode";
        public static final String contributor = "contributor";
        public static final String contributedTrack = "contributedTrack";
        public static final String remark = "remark";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String ALBUM_CODE = "ALBUM_CODE";
        public static final String CONTRIBUTOR = "CONTRIBUTOR";
        public static final String CONTRIBUTED_TRACK = "CONTRIBUTED_TRACK";
        public static final String REMARK = "REMARK";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ALBUM_CONTRIBUTOR";

}
