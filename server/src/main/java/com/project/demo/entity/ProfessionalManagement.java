package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 专业管理：(ProfessionalManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProfessionalManagement")
public class ProfessionalManagement implements Serializable {

    // ProfessionalManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professional_management_id")
    private Integer professional_management_id;

    // 专业名称
    @Basic
    private String major_name;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
