package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 学生信息：(StudentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "StudentInformation")
public class StudentInformation implements Serializable {

    // StudentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_information_id")
    private Integer student_information_id;

    // 学生编号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 性别
    @Basic
    private String gender;
    // 院系名称
    @Basic
    private String name_of_department;
    // 学习专业
    @Basic
    private String major;
    // 班级名称
    @Basic
    private String class_name;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
