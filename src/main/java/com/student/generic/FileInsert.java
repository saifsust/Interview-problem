package com.student.generic;

public class FileInsert extends BaseResult{
    private String fileName;

    public FileInsert(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
