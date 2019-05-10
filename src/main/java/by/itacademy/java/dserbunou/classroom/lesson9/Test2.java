package by.itacademy.java.dserbunou.classroom.lesson9;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("start main");
        try {
            method1();
            System.out.println("end of try section`");
        } catch (Exception e) {
            System.out.println("exception caught");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end main");
    }

    private static void method1() throws Exception {
        System.out.println("start method1");
        method2();
        System.out.println("end method1");
    }

    private static void method2() throws Exception {
        System.out.println("start method2");
        method3();
        System.out.println("end method2");
    }

    private static void method3() throws Exception {
        System.out.println("start method3");
        if (true) {
            // throw new RuntimeException("my 1st exception");
            throw new Exception("my 1st exception");
        }
        System.out.println("end method3");
    }
}
