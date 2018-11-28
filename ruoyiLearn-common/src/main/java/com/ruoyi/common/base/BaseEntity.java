package com.ruoyi.common.base;

import javax.print.DocFlavor;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//pojo的公共属性

/**
 * Entity基类
 */
public class BaseEntity implements Serializable{
    /**搜索值**/
    private String searchValue;
    /**
     * 创建者
     */
    private String creteBy;
    /**
     * 创建时间
     */
    //TODO:序列化格式
    private Date creteTime;

    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新时间
     */
    //TODO:序列化格式
    private Date updateTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 请求参数
     */
    private Map<String,Object> params;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getCreteBy() {
        return creteBy;
    }

    public void setCreteBy(String creteBy) {
        this.creteBy = creteBy;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Map<String, Object> getParams() {
        if(params==null){
            params=new HashMap<>();
        }
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
