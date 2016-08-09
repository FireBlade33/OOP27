package lesson6;

public class Car {
	String brand;
	double expense;
	int mileage;
	int maxVolumeTank;
	double currentFuelTank;
	boolean start;
	
	public Car(String brand, double expense, int mileage){
		this.brand = brand;
		this.expense = expense;
		this.mileage = mileage;
	}
	
	public void drive(int distance){
		if(start){
			if(currentFuelTank >= (expense * distance)){
				mileage = mileage + distance;
				currentFuelTank = currentFuelTank - (expense * distance);
				System.out.println("Driving ...");
			}
			else {
				mileage = (int)(mileage + (currentFuelTank * expense));
				currentFuelTank = 0;
				System.out.println("Топливо закончилось, заправьтесь!");
				start = false;
				
		}
	}
}
	
	public void start(){
		if(start){
			start = false;
			System.out.println("Машина уже заведена!");
		} else if(currentFuelTank <= 0){
			System.out.println("Недостаточно топлива, заправьтесь!");
		} else {
			start = true;
			System.out.println("Запуск машины успешен!");
		}
	}
	
	
	public void fill(double fuel){
		if((currentFuelTank + fuel) > maxVolumeTank){
			currentFuelTank = maxVolumeTank;
			System.out.println("Бак заправлен до полного!");
		}
		else currentFuelTank = currentFuelTank + fuel;
		System.out.println("Бак заправлен на " + fuel + "литров!");
		
		
	}
	public void printStatus(){
		System.out.println("Марка: " + brand);
		System.out.println("Расход топлива: " + expense);
		System.out.println("Пробег: " + mileage);
		System.out.println("Макс.объем бака: " + maxVolumeTank);
		System.out.println("Текущее кол-во топлива: " + currentFuelTank);
		System.out.println("Заведена: " + start);
		
		
	}
//	public void printInfo(){
//		System.out.printf("Model : %s, fuel: %4.2f, mileage: %05d, maxVolumeTank: % )
//	}
	
	

}
