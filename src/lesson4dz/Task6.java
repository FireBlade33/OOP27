package lesson4dz;

public class Task6 {
		
		public static void main(String[] args) {
		

	}
		public static void insertSort(int [] array){
			 for (int i = 1; i < array.length; i++) {
				   for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				    lesson4.Task1.swap(array, j - 1, j);
				   }
				  }
				 }
			
			
			 
		
	}

