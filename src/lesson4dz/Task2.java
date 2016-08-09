package lesson4dz;

public class Task2 {

	public static void main(String[] args) {
		
		System.out.println(factorial(3));
		

	}
	public static int factorial(int n){
		int result;
		
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		result = factorial(n - 1) * n;
		return result;
	}
	
	public static int factorialV2(int a){
		return a == 1 ? 1 : a * factorialV2(a - 1);
		
	}

}
