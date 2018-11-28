package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysDept;

public interface ISysDeptService {
    /**
     * 新增部门信息
     * @param dept
     * @return
     */
    public int insetDept(SysDept dept);
    /**
     * 根据id查询部门信息
     */
    public SysDept selectDeptById(Long deptId);
}
