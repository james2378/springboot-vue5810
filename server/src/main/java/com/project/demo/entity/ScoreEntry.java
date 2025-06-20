package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 成绩录入：(ScoreEntry)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ScoreEntry")
public class ScoreEntry implements Serializable {

    // ScoreEntry编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "score_entry_id")
    private Integer score_entry_id;

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
    // 测试得分
    @Basic
    private Integer test_score;
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
