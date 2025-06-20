package com.project.demo.controller;

import com.project.demo.entity.DepartmentManagement;
import com.project.demo.service.DepartmentManagementService;
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
 * 院系管理：(DepartmentManagement)表控制层
 *
 */
@RestController
@RequestMapping("/department_management")
public class DepartmentManagementController extends BaseController<DepartmentManagement, DepartmentManagementService> {

    /**
     * 院系管理对象
     */
    @Autowired
    public DepartmentManagementController(DepartmentManagementService service) {
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
