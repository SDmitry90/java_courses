package by.itacademy.java.dserbunou.classroom.lesson6;

public class Test1 {
    private int i;

    public static void main(String[] args) {
        Test1 o1 = new Test1(1);
        Test1 o2 = new Test1(2);
    }

    public Test1(int i) {
        this.i = i;
        System.out.println("конструктор:" + i);
    }

    {
        System.out.println("блок инициализации объекта:" + i);
    }
    static {
        System.out.println("статический блок инициализации класса");
    }

}
