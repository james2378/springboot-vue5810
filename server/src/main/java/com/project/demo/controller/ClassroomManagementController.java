package com.project.demo.controller;

import com.project.demo.entity.ClassroomManagement;
import com.project.demo.service.ClassroomManagementService;
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
 * 教室管理：(ClassroomManagement)表控制层
 *
 */
@RestController
@RequestMapping("/classroom_management")
public class ClassroomManagementController extends BaseController<ClassroomManagement, ClassroomManagementService> {

    /**
     * 教室管理对象
     */
    @Autowired
    public ClassroomManagementController(ClassroomManagementService service) {
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
