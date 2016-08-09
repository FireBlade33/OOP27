package lesson4dz;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		
		int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		shellSort(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	public static void shellSort(int [] array){
		int step = array.length/2;
		while(step > 0){
			
			for(int i = 0; i < (array.length - step); i++){
			int j = i;
			while(j >= 0 && (array[j] > array[j + step])){
				int temp = array[j];
				array[j] = array[j + step];
				array[j + step] = temp;
				j--;
			}
			
			
			
			}
			
		}
	}

}
