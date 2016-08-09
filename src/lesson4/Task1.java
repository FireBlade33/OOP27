package lesson4;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		

	}
	public static void selectionSort(int [] array){
		for(int j = 0; j < array.length - 1; j++){
		int minIndex = j;
		for(int i = j + 1; i < array.length; i++){
			if(array[i] < array[minIndex]){
					minIndex = i;
				}
			}
		swap(array, j, minIndex);
//		int tmp = array[j];
//		array[j] = array[minIndex];
//		array[minIndex] = tmp;
		
	}
	}
	public static void swap(int [] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	}


