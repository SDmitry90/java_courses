package by.itacademy.java.dserbunou.classroom.recursion;

public class Test1 {

    public static void main(String[] args) {
        // Дано натуральное число n>1. Проверьте, является ли оно простым. Программа
        // должна вывести слово YES, если число простое и NO, если число составное.

        int n = 1223;
        test(2, n);
    }

    private static void test(int m, int n) {
        int delta = n % m;

        if (n == m) {
            System.out.println("YES");
            return;
        }

        if (delta == 0) {
            System.out.println("NO");
        } else {
            test(m + 1, n);
        }

    }

}
