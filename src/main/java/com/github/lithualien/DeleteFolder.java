package com.github.lithualien;

import java.io.File;

public class DeleteFolder {

    public DeleteFolder(File file) {
        deleteFolder(file);
        file.delete();
        System.out.println("The folder was successfully deleted.");
    }

    private void deleteFolder(File file) {
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
