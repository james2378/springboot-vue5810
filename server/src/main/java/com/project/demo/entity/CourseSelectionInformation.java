package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 选课信息：(CourseSelectionInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseSelectionInformation")
public class CourseSelectionInformation implements Serializable {

    // CourseSelectionInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_selection_information_id")
    private Integer course_selection_information_id;

    // 课程名称
    @Basic
    private String course_name;
    // 上课地点
    @Basic
    private String class_location;
    // 开始时间
    @Basic
    private String start_time;
    // 结束时间
    @Basic
    private String end_time;
    // 教师编号
    @Basic
    private Integer teacher_no;
    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 选课时间
    @Basic
    private Timestamp course_selection_time;
    // 标注说明
    @Basic
    private String annotation_notes;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
