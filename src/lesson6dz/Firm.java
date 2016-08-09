package lesson6dz;

import java.util.ArrayList;

public class Firm {
	String firmName;
	String adress;
	int firmBill;
	ArrayList <Employee> list = new ArrayList<Employee>();
	
	public Firm(String firmName, String adress, int firmBill){
		this.firmName = firmName;
		this.adress = adress;
		this.firmBill = firmBill;
		list = new ArrayList<>();
		
		
	}
	public boolean addEmployee(Employee employee){
		if(list.contains(employee)){
			return false;
		}
		else {
			list.add(employee);
			return true;
		}
		
	}
	public boolean fireEmployee(String name, String surname){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).name == name && list.get(i).surname == surname){
				list.remove(i);
				return true;
				}
			}
		return false;
	}
		
	public ArrayList<Employee> getAllEmployees(){
		return list;
	}
	
	public ArrayList<Employee> getAllEmployeesOrderedBySalary(){
		
		for(int i = 0; i < list.size() - 1; i++){
			if(list.get(i).salary < list.get(i + 1).salary){
				int temp = list.get(i).salary;
				list.get(i).salary = list.get(i + 1).salary;
				list.get(i + 1).salary = temp;
				
			}
		}
		return list;
	}
	
	
	
	public void giveSalaryForAll(){
		while(firmBill > 0){
			
		for(int i = 0; i < list.size(); i++){
			if(firmBill >= list.get(i).salary){
			firmBill = firmBill - list.get(i).salary;
			list.get(i).cardAccount = list.get(i).cardAccount + list.get(i).salary;
			}
			
			else{
				list.get(i).cardAccount = firmBill;
				firmBill = 0;
				
			}
		}
	}
	
}
}


