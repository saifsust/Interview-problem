package com.student.generic;

public class FolderInsert extends BaseResult{
    private int allFolderCount;

    public FolderInsert(int allFolderCount) {
        this.allFolderCount = allFolderCount;
    }

    public int getAllFolderCount() {
        return allFolderCount;
    }

    public void setAllFolderCount(int allFolderCount) {
        this.allFolderCount = allFolderCount;
    }
}
