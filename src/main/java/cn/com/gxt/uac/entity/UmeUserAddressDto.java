
package cn.com.gxt.uac.entity;

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
 * Entity class map to table "用户配送地址管理表"
 *
 * @author ume-team
 */
@Entity
@Table(name="UME_USER_ADDRESS")
@TableDesc(label="用户配送地址管理表")
public class UmeUserAddressDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 用户识别ID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="用户识别ID")
    @Column(name="USER_ID", nullable=false, length=32)
    private String userId;

   /**
    * 序号 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=2, type="INT", label="序号")
    @Column(name="SEQ", nullable=false)
    private Integer seq;

   /**
    * 地址(省) 
    */
    @Size(max=8)
    @ColumnDesc(index=3, type="VARCHAR", label="地址(省)")
    @Column(name="ADDRESS_PROVINCE", nullable=true, length=8)
    private String addressProvince;

   /**
    * 地址(市) 
    */
    @Size(max=8)
    @ColumnDesc(index=4, type="VARCHAR", label="地址(市)")
    @Column(name="ADDRESS_CITY", nullable=true, length=8)
    private String addressCity;

   /**
    * 地址(区) 
    */
    @Size(max=8)
    @ColumnDesc(index=5, type="VARCHAR", label="地址(区)")
    @Column(name="ADDRESS_DISTRICT", nullable=true, length=8)
    private String addressDistrict;

   /**
    * 地址(其余) 
    */
    @Size(max=64)
    @ColumnDesc(index=6, type="VARCHAR", label="地址(其余)")
    @Column(name="ADDRESS_REST", nullable=true, length=64)
    private String addressRest;

   /**
    * 联系人 
    */
    @Size(max=16)
    @ColumnDesc(index=7, type="VARCHAR", label="联系人")
    @Column(name="CONTACT_PERSON", nullable=true, length=16)
    private String contactPerson;

   /**
    * 联系电话 
    */
    @Size(max=16)
    @ColumnDesc(index=8, type="VARCHAR", label="联系电话")
    @Column(name="CONTACT_NUMBER", nullable=true, length=16)
    private String contactNumber;

   /**
    * 地址类别 
    */
    @Size(max=16)
    @ColumnDesc(index=9, type="VARCHAR", label="地址类别")
    @Column(name="ADDRESS_TYPE", nullable=true, length=16)
    private String addressType;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(9 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(9 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(9 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(9 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "用户识别ID"
     */
    public String getUserId() {
        return this.userId;
    }
    /**
     *　Set the "用户识别ID"
     */
    public void setUserId(
            String userId) {
        this.userId = userId;
    }

    /**
     *　Get the "序号"
     */
    public Integer getSeq() {
        return this.seq;
    }
    /**
     *　Set the "序号"
     */
    public void setSeq(
            Integer seq) {
        this.seq = seq;
    }

    /**
     *　Get the "地址(省)"
     */
    public String getAddressProvince() {
        return this.addressProvince;
    }
    /**
     *　Set the "地址(省)"
     */
    public void setAddressProvince(
            String addressProvince) {
        this.addressProvince = addressProvince;
    }

    /**
     *　Get the "地址(市)"
     */
    public String getAddressCity() {
        return this.addressCity;
    }
    /**
     *　Set the "地址(市)"
     */
    public void setAddressCity(
            String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     *　Get the "地址(区)"
     */
    public String getAddressDistrict() {
        return this.addressDistrict;
    }
    /**
     *　Set the "地址(区)"
     */
    public void setAddressDistrict(
            String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    /**
     *　Get the "地址(其余)"
     */
    public String getAddressRest() {
        return this.addressRest;
    }
    /**
     *　Set the "地址(其余)"
     */
    public void setAddressRest(
            String addressRest) {
        this.addressRest = addressRest;
    }

    /**
     *　Get the "联系人"
     */
    public String getContactPerson() {
        return this.contactPerson;
    }
    /**
     *　Set the "联系人"
     */
    public void setContactPerson(
            String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     *　Get the "联系电话"
     */
    public String getContactNumber() {
        return this.contactNumber;
    }
    /**
     *　Set the "联系电话"
     */
    public void setContactNumber(
            String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     *　Get the "地址类别"
     */
    public String getAddressType() {
        return this.addressType;
    }
    /**
     *　Set the "地址类别"
     */
    public void setAddressType(
            String addressType) {
        this.addressType = addressType;
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
    public UmeUserAddressDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        UmeUserAddressDto newInstance = new UmeUserAddressDto();
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
        public static final String INSERT = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_DELETE"; 
        public static final String FIND = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.uac.entity.UME_USER_ADDRESS_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String userId = "userId";
        public static final String seq = "seq";
        public static final String addressProvince = "addressProvince";
        public static final String addressCity = "addressCity";
        public static final String addressDistrict = "addressDistrict";
        public static final String addressRest = "addressRest";
        public static final String contactPerson = "contactPerson";
        public static final String contactNumber = "contactNumber";
        public static final String addressType = "addressType";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String USER_ID = "USER_ID";
        public static final String SEQ = "SEQ";
        public static final String ADDRESS_PROVINCE = "ADDRESS_PROVINCE";
        public static final String ADDRESS_CITY = "ADDRESS_CITY";
        public static final String ADDRESS_DISTRICT = "ADDRESS_DISTRICT";
        public static final String ADDRESS_REST = "ADDRESS_REST";
        public static final String CONTACT_PERSON = "CONTACT_PERSON";
        public static final String CONTACT_NUMBER = "CONTACT_NUMBER";
        public static final String ADDRESS_TYPE = "ADDRESS_TYPE";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "UME_USER_ADDRESS";

}
