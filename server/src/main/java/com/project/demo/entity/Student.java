package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 学生：(Student)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Student")
public class Student implements Serializable {

    // Student编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer student_id;

    // 学生编号
    @Basic
    private String student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 性别
    @Basic
    private String gender;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
