package com.project.demo.controller;

import com.project.demo.entity.CourseSelectionInformation;
import com.project.demo.service.CourseSelectionInformationService;
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
 * 选课信息：(CourseSelectionInformation)表控制层
 *
 */
@RestController
@RequestMapping("/course_selection_information")
public class CourseSelectionInformationController extends BaseController<CourseSelectionInformation, CourseSelectionInformationService> {

    /**
     * 选课信息对象
     */
    @Autowired
    public CourseSelectionInformationController(CourseSelectionInformationService service) {
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
