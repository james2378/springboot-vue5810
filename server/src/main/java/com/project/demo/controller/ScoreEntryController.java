package com.project.demo.controller;

import com.project.demo.entity.ScoreEntry;
import com.project.demo.service.ScoreEntryService;
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
 * 成绩录入：(ScoreEntry)表控制层
 *
 */
@RestController
@RequestMapping("/score_entry")
public class ScoreEntryController extends BaseController<ScoreEntry, ScoreEntryService> {

    /**
     * 成绩录入对象
     */
    @Autowired
    public ScoreEntryController(ScoreEntryService service) {
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
