package com.telran.org.lessonnineteen;

import java.io.File;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) {
        String path = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessonnineteen";

        // 1. Create a File as object
        File file = new File(path + "\\file.txt");

        // 2. File exists
        boolean exists = file.exists();
        System.out.println("File exists: " + exists);

        // 3. Directory or file
        System.out.println("File is directory: " + file.isDirectory());

        //Directory is directory
        File fileDirectory = new File(path);
        System.out.println("fileDirectory is directory: " + fileDirectory.isDirectory());

        // 4. Create directory - newDirectory
        File fileNewDir = new File(path + "\\newDirectory");
        System.out.println("fileNewDir exist: " + fileNewDir.exists());
        boolean created = fileNewDir.mkdir();
        System.out.println("Was created: " + created);

        // length of file
        System.out.println("Length of file: " + file.length());

        // 5. File delete
        File fileToDelete = new File(path + "\\fileNew.txt");
        boolean delete = fileToDelete.delete();
        System.out.println("file delete status ? " + delete);

        // 6. List if files
        String[] list = fileDirectory.list();
        System.out.println(Arrays.toString(list));

        // 7. List of files
        File[] files = fileDirectory.listFiles();

        for (File elementFile : files) {
            System.out.println(elementFile.getName() + " " + elementFile.length());
        }

    }
}
