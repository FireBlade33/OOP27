package lesson4dz;

public class Task10 {

	public static void main(String[] args) {
//		for(int i = 1; i < 10; i++){
		System.out.println("res = " + fib(50));
		}

	//}
	public static int fib(int val){
		if(val == 0 || val == 1) return val;
		return fib(val - 1) + fib(val - 2);
	}

}
