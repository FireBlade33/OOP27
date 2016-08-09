package lesson4dz;

public class Task8 {

	public static void main(String[] args) {
		int a = 1589;
		System.out.print(sum(a));
		
		

		
	}
	public static int sum(int val){
		if(val < 10) {
			return val;
		}
		else{
			return (val % 10) + sum(val / 10);
		}
		
	}
	public static int sumV2(int n){
		return n == 0 ? 0 : sum(n / 10) + (n % 10);
	}

}
