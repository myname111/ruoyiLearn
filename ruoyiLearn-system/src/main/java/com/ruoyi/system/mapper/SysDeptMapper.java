package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysDept;

/**
 * 部门管理 dao
 */
public interface SysDeptMapper {
    /**
     * 新增部门
     */
    public int insertDept(SysDept dept);
    /**
     * 根据部门id查询部门信息
     */
    public SysDept selectDeptById(Long depId);
}
