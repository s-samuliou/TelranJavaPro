package com.telran.org.lessonnineteen.homeworknineteen;

import java.io.*;
import java.util.Scanner;

public class Startup {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the task number (1, 2, or 3):");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                taskOne("fileOne.txt");
                break;
            case 2:
                taskTwo("fileTwo.txt");
                break;
            case 3:
                taskThree("C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessonnineteen\\homeworknineteen\\testdir");
                break;
            default:
                System.out.println("Invalid task number");
                break;
        }

        scanner.close();
    }

    public void taskOne(String fileName) {
        String pathToDirectory = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\lessonnineteen\\homeworknineteen\\";
        String data = "This is my first experience when I myself work with IO API. I can do everything!";

        try (FileOutputStream file = new FileOutputStream(pathToDirectory + fileName)) {
            file.write(data.getBytes());
            System.out.println("File was created successfully");
        } catch (IOException e) {
            throw new RuntimeException("File wasn't created successfully");
        }
    }

    public void taskTwo(String fileName) {
        String pathToDirectory = "C:\\Users\\ssamu\\OneDrive\\Desktop\\";

        File file = new File(pathToDirectory + fileName);

        try {
            file.createNewFile();
            System.out.println("File was created!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (file.exists()) {
            file.delete();
            System.out.println("File was deleted!");
        }
    }

    public void taskThree(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory does not exist");
            return;
        }

        deleteDirectory(directory);
        System.out.println("Directory and its subdirectories were deleted successfully");
    }

    private void deleteDirectory(File dir) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        dir.delete();
    }
}
