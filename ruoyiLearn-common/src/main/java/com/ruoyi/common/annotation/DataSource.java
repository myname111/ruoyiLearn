package com.ruoyi.common.annotation;

import java.lang.annotation.*;

/**
 * 数据权限过滤注解
 */
@Target(ElementType.METHOD)//描述注解的使用范围
@Retention(RetentionPolicy.RUNTIME)//注解的生命周期
@Documented//标注注解,表示自定义的注解是否可以被工具化到javaDoc中
//@Inherited//表示被自定义注解标注的类的子类也会继承该自定义注解
public @interface DataSource {
    /**
     * 表的别名
     */
    public String tableAlias() default "";
}
