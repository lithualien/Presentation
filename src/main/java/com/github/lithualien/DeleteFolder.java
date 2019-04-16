package com.github.lithualien;

import java.io.File;

public class DeleteFolder {
    public void deleteFolder(File file) {
        try {
            File files[] = file.listFiles();
            for (File temp : files) {
                deleteFolder(temp);
                temp.delete();
            }
        }
        catch (Exception e) {
        }
    }
}
