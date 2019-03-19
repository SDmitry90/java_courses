package by.itacademy.java.dserbunou.classroom.lesson10;

import java.io.File;

public class FileSamples {

    public static void main(String[] args) {
        showSamples(new File("C:\\Windows\\winhlp32.exe"));
        System.out.println("-----------------------");
        showSamples(new File("C:\\Windows"));

    }

    private static void showSamples(File file) {
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path:: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Is writeable: " + file.canWrite());
            System.out.println("Is readable: " + file.canRead());
            System.out.println("Is a directory: " + file.isDirectory());
            System.out.println("File size in bytes: " + file.length());
        }
    }
}
