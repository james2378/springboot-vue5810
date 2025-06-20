package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 排课管理：(CourseSchedulingManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseSchedulingManagement")
public class CourseSchedulingManagement implements Serializable {

    // CourseSchedulingManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_scheduling_management_id")
    private Integer course_scheduling_management_id;

    // 标题
    @Basic
    private String title;
    // 课程名称
    @Basic
    private String course_name;
    // 上课地点
    @Basic
    private String class_location;
    // 开始时间
    @Basic
    private Timestamp start_time;
    // 结束时间
    @Basic
    private Timestamp end_time;
    // 教师编号
    @Basic
    private Integer teacher_no;
    // 姓名
    @Basic
    private String full_name;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
