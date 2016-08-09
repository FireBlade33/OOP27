package lesson4dz;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		
		int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		chetNechetSort(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	public static void chetNechetSort(int [] array){
		for(int k = 0; k < array.length; k ++){
			if(k % 2 == 0)
				for(int j = array.length - 1; j > 0; j -= 2){
					if(array[j] < array[j - 1]){
						lesson4.Task1.swap(array, j, j - 1);
						
					}
				}
			else	
			for(int j = array.length - 2; j > 0; j-=2){
				if(array[j] < array[j - 1]){
					lesson4.Task1.swap(array, j, j - 1);
				}
			}
				
			
		}
		
	}

}
