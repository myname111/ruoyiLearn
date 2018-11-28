package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.mapper.SysDeptMapper;
import com.ruoyi.system.service.ISysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDeptServiceImpl implements ISysDeptService{
    @Autowired
    private SysDeptMapper sysDeptMapper;
    @Override
    public int insetDept(SysDept dept) {
        int count = sysDeptMapper.insertDept(dept);
        return count;
    }

    @Override
    public SysDept selectDeptById(Long deptId) {
        return null;
    }
}
