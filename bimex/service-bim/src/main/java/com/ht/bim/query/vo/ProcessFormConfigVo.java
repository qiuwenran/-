package com.ht.bim.query.vo;

import java.util.Date;

/**
 * @author zhong
 * @date 2019-2-5
 */
public class ProcessFormConfigVo {
    private String formConfigID;
    /**
     * 流程编号
     */
    private String processID;
    /**
     * 节点编号
     */
    private String nodeID;
    private Date createTime;
    private String createUserID;
    private Date updateTime;
    private String updateUserID;
    private String formJson;
    private Boolean isDeleted;

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getFormConfigID() {
        return formConfigID;
    }

    public void setFormConfigID(String formConfigID) {
        this.formConfigID = formConfigID;
    }

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserID() {
        return createUserID;
    }

    public void setCreateUserID(String createUserID) {
        this.createUserID = createUserID;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserID() {
        return updateUserID;
    }

    public void setUpdateUserID(String updateUserID) {
        this.updateUserID = updateUserID;
    }

    public String getFormJson() {
        return formJson;
    }

    public void setFormJson(String formJson) {
        this.formJson = formJson;
    }
}
