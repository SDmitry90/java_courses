package by.itacademy.java.dserbunou.classroom.lesson4;

public class Task1 {
    private static int staticField;
    private int nonStaticField;

    public static void main(String[] args) {
        doStatic();
       // doNonStatic ();
        
        System.out.println(staticField);
       
        Task1 odjectInstance = new Task1();
        System.out.println(odjectInstance.nonStaticField);
        System.out.println(odjectInstance.staticField);
        odjectInstance.doStatic();
        odjectInstance.doNonStatic();
    }
    private static void doStatic() {
    }
    private void doNonStatic() {
    }
}
