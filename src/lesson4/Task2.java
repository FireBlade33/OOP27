package lesson4;

public class Task2 {

	public static void main(String[] args) {
		
		
		System.out.println(sum(1, 3));
		

	}
	public static void f(int count, int limit){
		System.out.println(count);
		if(count >= limit){
			return;
		}
		f(count + 1, limit);
		System.out.println(count);
		return;
		
	}


	
	public static int sum(int start, int end){
		if(start == end){
			return end;
		}
		return start + sum(start + 1, end);
		
	

		
		//		int recResult = sum(start + 1, end);
		//		int res = start + recResult;
		//		return res;
		
		
		
		
	}
}