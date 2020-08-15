package com.ssm.controller;

import com.ssm.entity.File;
import com.ssm.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @anther mt
 * @creater 2020-08-15 9:39
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    @RequestMapping("getDataById")
    public String getDataById(HttpServletRequest request){
        Integer id = 1;
        File file = fileService.selectByPrimaryKey(id);
        request.setAttribute("file",file);
        return "show";
    }

}
