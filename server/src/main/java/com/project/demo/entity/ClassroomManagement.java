package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 教室管理：(ClassroomManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ClassroomManagement")
public class ClassroomManagement implements Serializable {

    // ClassroomManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_management_id")
    private Integer classroom_management_id;

    // 教室名称
    @Basic
    private String classroom_name;
    // 所在楼层
    @Basic
    private String floor;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
