package com.ssm.entity;

/**
*   @anther  mt
*   @creater 2020-08-15 9:24
*/
public class File {
    /**
    * 上传的文件
    */
    private Integer id;

    /**
    * 文件名称
    */
    private String filename;

    /**
    * 文件地址
    */
    private String fileurl;

    /**
    * 是否删除（0否 1是）
    */
    private Integer isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}