package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 提交测试：(SubmitTest)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SubmitTest")
public class SubmitTest implements Serializable {

    // SubmitTest编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "submit_test_id")
    private Integer submit_test_id;

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
    private String release_time;
    // 提交时间
    @Basic
    private Timestamp submission_time;
    // 相关附件
    @Basic
    private String related_attachments;
    // 备注
    @Basic
    private String remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
