package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程信息：(CourseInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseInformation")
public class CourseInformation implements Serializable {

    // CourseInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_information_id")
    private Integer course_information_id;

    // 课程编号
    @Basic
    private String course_no;
    // 课程名称
    @Basic
    private String course_name;
    // 封面
    @Basic
    private String cover;
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
    // 详情介绍
    @Basic
    private String details;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
