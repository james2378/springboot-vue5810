package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程测试：(CourseTest)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseTest")
public class CourseTest implements Serializable {

    // CourseTest编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_test_id")
    private Integer course_test_id;

    // 课程名称
    @Basic
    private String course_name;
    // 教师编号
    @Basic
    private Integer teacher_no;
    // 学生学号
    @Basic
    private Integer student_no;
    // 学生姓名
    @Basic
    private String student_name;
    // 测试名称
    @Basic
    private String test_name;
    // 发布时间
    @Basic
    private Timestamp release_time;
    // 测试内容
    @Basic
    private String test_content;
    // 要求说明
    @Basic
    private String description_of_requirements;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
