package com.project.demo.controller;

import com.project.demo.entity.SubmitTest;
import com.project.demo.service.SubmitTestService;
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
 * 提交测试：(SubmitTest)表控制层
 *
 */
@RestController
@RequestMapping("/submit_test")
public class SubmitTestController extends BaseController<SubmitTest, SubmitTestService> {

    /**
     * 提交测试对象
     */
    @Autowired
    public SubmitTestController(SubmitTestService service) {
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
