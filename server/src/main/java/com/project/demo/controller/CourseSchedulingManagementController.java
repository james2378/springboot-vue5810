package com.project.demo.controller;

import com.project.demo.entity.CourseSchedulingManagement;
import com.project.demo.service.CourseSchedulingManagementService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 排课管理：(CourseSchedulingManagement)表控制层
 *
 */
@RestController
@RequestMapping("/course_scheduling_management")
public class CourseSchedulingManagementController extends BaseController<CourseSchedulingManagement, CourseSchedulingManagementService> {

    /**
     * 排课管理对象
     */
    @Autowired
    public CourseSchedulingManagementController(CourseSchedulingManagementService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
