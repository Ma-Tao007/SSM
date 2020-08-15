package com.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ssm.mapper.FileMapper;
import com.ssm.entity.File;
import com.ssm.service.FileService;
/**
*   @anther  mt
*   @creater 2020-08-15 9:24
*/
@Service
public class FileServiceImpl implements FileService{
    @Resource
    private FileMapper fileMapper;
    @Override
    public File selectByPrimaryKey(Integer id) {
        return fileMapper.selectByPrimaryKey(id);
    }
}
