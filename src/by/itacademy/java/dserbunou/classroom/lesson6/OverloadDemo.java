package by.itacademy.java.dserbunou.classroom.lesson6;

public class OverloadDemo {
    /*
     * public void test(int a) { System.out.println("a=" + a);
     * 
     * }
     * 
     * public double test(double a) { System.out.println("a=" + a); return a * a; }
     */

    public static void main(String[] args) {

        Car car = new PassengerCar();
        car.move();
        car = new Truck();
        car.move();

    }

}
