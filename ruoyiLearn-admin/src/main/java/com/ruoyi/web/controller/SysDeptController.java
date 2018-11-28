package com.ruoyi.web.controller;

import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.service.ISysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
@RequestMapping("/sysDept")
public class SysDeptController {
    @Autowired
    private ISysDeptService sysDeptService;
    /**
     * 新增部门
     */
    @RequestMapping("/dept")
    public SysDept addSave(SysDept sysDept){
        sysDeptService.insetDept(sysDept);
        return sysDept;
    }
}
