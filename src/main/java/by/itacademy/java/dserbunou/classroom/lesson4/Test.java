package by.itacademy.java.dserbunou.classroom.lesson4;

public class Test {
    private static class Car {
        public static int staticField;
        public int nonStaticField;

        @Override
        public String toString() {
            return "Car{" + "nonStaticField=" + nonStaticField + " static field=" + staticField + '}';
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("Car1 = " + car1); // строка + объект вызываетс€ метод toString()
        System.out.println("Car2 = " + car2);
        System.out.println("+1 both properties in both objects");
        car1.nonStaticField++;
        Car.staticField++; // статический можно вызвать пр€мо из класса, т.е. не нужно его выт€гивать через
                           // объект
        car2.nonStaticField++;
        car2.staticField++;
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);

    }

}
