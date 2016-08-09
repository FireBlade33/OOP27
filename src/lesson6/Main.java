package lesson6;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", 0.5, 50000);
		
		car1.brand = "BMW";
		car1.expense = 0.1;
		car1.mileage = 0;
		car1.maxVolumeTank = 50;
		car1.currentFuelTank = 40;
		car1.start = false;
		
		car1.start();
		car1.drive(500);
		car1.fill(100);
		car1.printStatus();
	}
}
