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
				System.out.println("������� �����������, �����������!");
				start = false;
				
		}
	}
}
	
	public void start(){
		if(start){
			start = false;
			System.out.println("������ ��� ��������!");
		} else if(currentFuelTank <= 0){
			System.out.println("������������ �������, �����������!");
		} else {
			start = true;
			System.out.println("������ ������ �������!");
		}
	}
	
	
	public void fill(double fuel){
		if((currentFuelTank + fuel) > maxVolumeTank){
			currentFuelTank = maxVolumeTank;
			System.out.println("��� ��������� �� �������!");
		}
		else currentFuelTank = currentFuelTank + fuel;
		System.out.println("��� ��������� �� " + fuel + "������!");
		
		
	}
	public void printStatus(){
		System.out.println("�����: " + brand);
		System.out.println("������ �������: " + expense);
		System.out.println("������: " + mileage);
		System.out.println("����.����� ����: " + maxVolumeTank);
		System.out.println("������� ���-�� �������: " + currentFuelTank);
		System.out.println("��������: " + start);
		
		
	}
//	public void printInfo(){
//		System.out.printf("Model : %s, fuel: %4.2f, mileage: %05d, maxVolumeTank: % )
//	}
	
	

}
