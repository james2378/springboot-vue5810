package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课表管理：(ScheduleManagement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ScheduleManagement")
public class ScheduleManagement implements Serializable {

    // ScheduleManagement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_management_id")
    private Integer schedule_management_id;

    // 标题
    @Basic
    private String title;
    // 日期
    @Basic
    private Timestamp date;
    // 第一节课
    @Basic
    private String the_first_class;
    // 第二节课
    @Basic
    private String the_second_class;
    // 第三节课
    @Basic
    private String the_third_class;
    // 第四节课
    @Basic
    private String the_fourth_class;
    // 第五节课
    @Basic
    private String section_5;
    // 第六节课
    @Basic
    private String section_6;
    // 第七节课
    @Basic
    private String section_7;
    // 第八节课
    @Basic
    private String section_8;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
