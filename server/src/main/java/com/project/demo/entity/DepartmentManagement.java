package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 院系管理：(DepartmentManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DepartmentManagement")
public class DepartmentManagement implements Serializable {

    // DepartmentManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_management_id")
    private Integer department_management_id;

    // 院系名称
    @Basic
    private String name_of_department;
    // 负责人
    @Basic
    private String person_in_charge;
    // 详情介绍
    @Basic
    private String details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
