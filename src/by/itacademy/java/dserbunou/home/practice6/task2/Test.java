package by.itacademy.java.dserbunou.home.practice6.task2;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        File rootFile = getLetterC();

        printThree(rootFile); // не вышло в путь вставить полученную букву диска

        // printThree2(new File("C:\\"));

    }

    public static void printThree(File f) {

        if (!f.isDirectory()) {
            System.out.println(f.getName());
        }

        if (f.isDirectory()) {
            try {
                System.out.println(f.getCanonicalFile());
                File[] child = f.listFiles();

                for (int i = 0; i < child.length; i++) {
                    System.out.println(child[i].getParent());
                    printThree(child[i]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void printThree2(File paths) {
        File[] child = paths.listFiles();
        if (child != null)
            for (File dir : child) {
                if (dir.isDirectory())
                    try {
                        System.out.println(dir.getCanonicalPath());
                        printThree2(dir);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
    }

    private static File getLetterC() {
        File[] letter = File.listRoots();
        /*
         * for (File file : letter) { System.out.println(file.getAbsolutePath()); break;
         * }
         */
        return letter[0];

    }

}
