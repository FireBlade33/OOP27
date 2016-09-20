package lesson3;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("ВАЗ");
        Car car3 = new Car("Ford", "Metalic");

        car.printAbout();
        car2.printAbout();
        car3.printAbout();


    }
}
