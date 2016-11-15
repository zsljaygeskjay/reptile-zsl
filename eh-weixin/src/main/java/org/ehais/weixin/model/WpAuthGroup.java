package org.ehais.weixin.model;

import java.io.Serializable;

public class WpAuthGroup implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.title
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.icon
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Integer icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.status
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.type
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.manager_id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Integer managerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.token
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.is_default
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Boolean isDefault;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.qr_code
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private String qrCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.wechat_group_id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Integer wechatGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.wechat_group_name
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private String wechatGroupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.wechat_group_count
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Integer wechatGroupCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_auth_group.is_del
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    private Boolean isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wp_auth_group
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.id
     *
     * @return the value of wp_auth_group.id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.id
     *
     * @param id the value for wp_auth_group.id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.title
     *
     * @return the value of wp_auth_group.title
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.title
     *
     * @param title the value for wp_auth_group.title
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.icon
     *
     * @return the value of wp_auth_group.icon
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Integer getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.icon
     *
     * @param icon the value for wp_auth_group.icon
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.status
     *
     * @return the value of wp_auth_group.status
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.status
     *
     * @param status the value for wp_auth_group.status
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.type
     *
     * @return the value of wp_auth_group.type
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.type
     *
     * @param type the value for wp_auth_group.type
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.manager_id
     *
     * @return the value of wp_auth_group.manager_id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.manager_id
     *
     * @param managerId the value for wp_auth_group.manager_id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.token
     *
     * @return the value of wp_auth_group.token
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.token
     *
     * @param token the value for wp_auth_group.token
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.is_default
     *
     * @return the value of wp_auth_group.is_default
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.is_default
     *
     * @param isDefault the value for wp_auth_group.is_default
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.qr_code
     *
     * @return the value of wp_auth_group.qr_code
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.qr_code
     *
     * @param qrCode the value for wp_auth_group.qr_code
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.wechat_group_id
     *
     * @return the value of wp_auth_group.wechat_group_id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Integer getWechatGroupId() {
        return wechatGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.wechat_group_id
     *
     * @param wechatGroupId the value for wp_auth_group.wechat_group_id
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setWechatGroupId(Integer wechatGroupId) {
        this.wechatGroupId = wechatGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.wechat_group_name
     *
     * @return the value of wp_auth_group.wechat_group_name
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public String getWechatGroupName() {
        return wechatGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.wechat_group_name
     *
     * @param wechatGroupName the value for wp_auth_group.wechat_group_name
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setWechatGroupName(String wechatGroupName) {
        this.wechatGroupName = wechatGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.wechat_group_count
     *
     * @return the value of wp_auth_group.wechat_group_count
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public Integer getWechatGroupCount() {
        return wechatGroupCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.wechat_group_count
     *
     * @param wechatGroupCount the value for wp_auth_group.wechat_group_count
     *
     * @mbggenerated Wed Apr 06 16:53:04 CST 2016
     */
    public void setWechatGroupCount(Integer wechatGroupCount) {
        this.wechatGroupCount = wechatGroupCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_auth_group.is_del
     *
     * @return the value of wp_auth_group.is_del
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_auth_group.is_del
     *
     * @param isDel the value for wp_auth_group.is_del
     *
     * @mbggenerated Wed Apr 06 16:53:05 CST 2016
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}