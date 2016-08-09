package lesson4dz;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(pow(2,4));
	}
		
	public static int powV2(int n, int m){
		return m == 0 ? 1 : m * pow(n, m - 1);
	}
	
	public static int powV3(int n, int m){
		if(m == 0) return 1; else return m * powV3(n, m - 1);
	}
	
	public static int pow(int n, int m){
		  if(m == 0){
		   return 1;
		  }
		  return n * pow(n, m - 1);
		  
		 

		}
	

}