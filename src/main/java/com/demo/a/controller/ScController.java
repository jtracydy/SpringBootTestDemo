package com.demo.a.controller;


import com.demo.a.entity.ScEntity;
import com.demo.a.service.ScService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Api(tags = "sc")
@Controller
@RequestMapping("/sc")
public class ScController {

    @Autowired
    private ScService scService;

    @ApiOperation(value = "根据s_id查询分数")
    @ResponseBody
    @RequestMapping(value = "/queryBySId", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = RequestMethod.POST)
    public List<ScEntity> getScDynamicQuery(Long sId) {
        return scService.findBySId(sId);
    }

}
