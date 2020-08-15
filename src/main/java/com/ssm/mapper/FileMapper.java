package com.ssm.mapper;

import com.ssm.entity.File;

/**
*   @anther  mt
*   @creater 2020-08-15 9:24
*/
public interface FileMapper {
    File selectByPrimaryKey(Integer id);
}