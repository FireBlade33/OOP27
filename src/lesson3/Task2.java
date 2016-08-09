package lesson3;

import java.util.Arrays;


public class Task2 {

	 public static void main(String[] args) {
	 
	  int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
	  
	  bubleSort(arr);
	  
	  System.out.println(Arrays.toString(arr));
	  
	  
	  
	 }
	 

	 public static void bubleSort(int[] array) {
	  
	  boolean hasChange = true;
	  for (int i = 0; hasChange; i++) {
	   hasChange = false;
	   System.out.println(Arrays.toString(array));
	   for (int j = 0; j < array.length - 1 - i; j++) {
	    if (array[j] > array[j + 1]) {
	     int buff = array[j + 1];
	     array[j + 1] = array[j];
	     array[j] = buff;
	     hasChange = true;
	    }
	   }
	   
	  }
	  
	 }
	}
