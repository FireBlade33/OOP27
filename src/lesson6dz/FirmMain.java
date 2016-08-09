package lesson6dz;

public class FirmMain {

	public static void main(String[] args) {
		Firm firm = new Firm("Amrita", "Pobedu 56", 100000);
		Employee person = new Employee("Alex", "Stepanov", 5000, 321, "man", 5);
		Employee person2 = new Employee("Vasia", "Grigot", 7000, 0, "man", 5);
		Employee person3 = new Employee("Petya", "Petrov", 2000, 3332, "man", 5);
		Employee person4 = new Employee("Lesha", "Ermolov", 15000, 6432, "man", 5);
		
		firm.addEmployee(person);
		firm.addEmployee(person2);
		firm.addEmployee(person3);
		firm.addEmployee(person4);
		firm.fireEmployee("Alex", "Stepanov");
		System.out.println(firm);
		
		
		
		
		

	}

}
