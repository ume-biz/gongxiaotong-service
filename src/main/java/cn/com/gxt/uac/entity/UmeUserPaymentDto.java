
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
 * Entity class map to table "用户支付卡绑定管理表"
 *
 * @author ume-team
 */
@Entity
@Table(name="UME_USER_PAYMENT")
@TableDesc(label="用户支付卡绑定管理表")
public class UmeUserPaymentDto extends TableEntity implements Serializable {
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
    * 支付卡类型 
    */
    @ColumnDesc(index=3, type="INT", label="支付卡类型")
    @Column(name="CARD_TYPE", nullable=true)
    private Integer cardType;

   /**
    * 支付卡卡号 
    */
    @Size(max=128)
    @ColumnDesc(index=4, type="VARCHAR", label="支付卡卡号")
    @Column(name="CARD_NUMBER", nullable=true, length=128)
    private String cardNumber;

   /**
    * 支付卡持卡人 
    */
    @Size(max=32)
    @ColumnDesc(index=5, type="VARCHAR", label="支付卡持卡人")
    @Column(name="CARD_OWNER", nullable=true, length=32)
    private String cardOwner;

   /**
    * 支付卡开户行 
    */
    @Size(max=32)
    @ColumnDesc(index=6, type="VARCHAR", label="支付卡开户行")
    @Column(name="CARD_BANK", nullable=true, length=32)
    private String cardBank;

   /**
    * 支付卡有效期 
    */
    @ColumnDesc(index=7, type="DATE", label="支付卡有效期")
    @Column(name="CARD_EXPIRATION_DATE", nullable=true)
    private java.sql.Date cardExpirationDate;

   /**
    * 支付卡状态 
    */
    @Size(max=8)
    @ColumnDesc(index=8, type="VARCHAR", label="支付卡状态")
    @Column(name="CARD_STATUS", nullable=true, length=8)
    private String cardStatus;

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
     *　Get the "支付卡类型"
     */
    public Integer getCardType() {
        return this.cardType;
    }
    /**
     *　Set the "支付卡类型"
     */
    public void setCardType(
            Integer cardType) {
        this.cardType = cardType;
    }

    /**
     *　Get the "支付卡卡号"
     */
    public String getCardNumber() {
        return this.cardNumber;
    }
    /**
     *　Set the "支付卡卡号"
     */
    public void setCardNumber(
            String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     *　Get the "支付卡持卡人"
     */
    public String getCardOwner() {
        return this.cardOwner;
    }
    /**
     *　Set the "支付卡持卡人"
     */
    public void setCardOwner(
            String cardOwner) {
        this.cardOwner = cardOwner;
    }

    /**
     *　Get the "支付卡开户行"
     */
    public String getCardBank() {
        return this.cardBank;
    }
    /**
     *　Set the "支付卡开户行"
     */
    public void setCardBank(
            String cardBank) {
        this.cardBank = cardBank;
    }

    /**
     *　Get the "支付卡有效期"
     */
    public java.sql.Date getCardExpirationDate() {
        return this.cardExpirationDate;
    }
    /**
     *　Set the "支付卡有效期"
     */
    public void setCardExpirationDate(
            java.sql.Date cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    /**
     *　Get the "支付卡状态"
     */
    public String getCardStatus() {
        return this.cardStatus;
    }
    /**
     *　Set the "支付卡状态"
     */
    public void setCardStatus(
            String cardStatus) {
        this.cardStatus = cardStatus;
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
    public UmeUserPaymentDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        UmeUserPaymentDto newInstance = new UmeUserPaymentDto();
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
        public static final String INSERT = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_DELETE"; 
        public static final String FIND = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.uac.entity.UME_USER_PAYMENT_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String userId = "userId";
        public static final String seq = "seq";
        public static final String cardType = "cardType";
        public static final String cardNumber = "cardNumber";
        public static final String cardOwner = "cardOwner";
        public static final String cardBank = "cardBank";
        public static final String cardExpirationDate = "cardExpirationDate";
        public static final String cardStatus = "cardStatus";
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
        public static final String CARD_TYPE = "CARD_TYPE";
        public static final String CARD_NUMBER = "CARD_NUMBER";
        public static final String CARD_OWNER = "CARD_OWNER";
        public static final String CARD_BANK = "CARD_BANK";
        public static final String CARD_EXPIRATION_DATE = "CARD_EXPIRATION_DATE";
        public static final String CARD_STATUS = "CARD_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "UME_USER_PAYMENT";

}
