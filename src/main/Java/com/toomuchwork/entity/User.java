package com.toomuchwork.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userid
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.realname
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userType
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer usertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.docTitleId
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer doctitleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.IsScheduling
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer isscheduling;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.departmentid
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer departmentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.registLevelid
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer registlevelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.delMark
     *
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    private Integer delmark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userid
     *
     * @return the value of user.userid
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userid
     *
     * @param userid the value for user.userid
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.realname
     *
     * @return the value of user.realname
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.realname
     *
     * @param realname the value for user.realname
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userType
     *
     * @return the value of user.userType
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userType
     *
     * @param usertype the value for user.userType
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.docTitleId
     *
     * @return the value of user.docTitleId
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getDoctitleid() {
        return doctitleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.docTitleId
     *
     * @param doctitleid the value for user.docTitleId
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.IsScheduling
     *
     * @return the value of user.IsScheduling
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getIsscheduling() {
        return isscheduling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.IsScheduling
     *
     * @param isscheduling the value for user.IsScheduling
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setIsscheduling(Integer isscheduling) {
        this.isscheduling = isscheduling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.departmentid
     *
     * @return the value of user.departmentid
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getDepartmentid() {
        return departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.departmentid
     *
     * @param departmentid the value for user.departmentid
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.registLevelid
     *
     * @return the value of user.registLevelid
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getRegistlevelid() {
        return registlevelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.registLevelid
     *
     * @param registlevelid the value for user.registLevelid
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setRegistlevelid(Integer registlevelid) {
        this.registlevelid = registlevelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.delMark
     *
     * @return the value of user.delMark
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.delMark
     *
     * @param delmark the value for user.delMark
     * @mbggenerated Mon Dec 21 13:57:44 CST 2020
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}