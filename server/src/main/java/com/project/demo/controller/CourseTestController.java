package com.project.demo.controller;

import com.project.demo.entity.CourseTest;
import com.project.demo.service.CourseTestService;
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
 * 课程测试：(CourseTest)表控制层
 *
 */
@RestController
@RequestMapping("/course_test")
public class CourseTestController extends BaseController<CourseTest, CourseTestService> {

    /**
     * 课程测试对象
     */
    @Autowired
    public CourseTestController(CourseTestService service) {
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
