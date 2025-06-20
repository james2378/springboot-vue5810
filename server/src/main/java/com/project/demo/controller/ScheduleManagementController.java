package com.project.demo.controller;

import com.project.demo.entity.ScheduleManagement;
import com.project.demo.service.ScheduleManagementService;
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
 * 课表管理：(ScheduleManagement)表控制层
 *
 */
@RestController
@RequestMapping("/schedule_management")
public class ScheduleManagementController extends BaseController<ScheduleManagement, ScheduleManagementService> {

    /**
     * 课表管理对象
     */
    @Autowired
    public ScheduleManagementController(ScheduleManagementService service) {
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
