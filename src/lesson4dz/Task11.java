package lesson4dz;
import java.util.Arrays;
public class Task11 {

	public static void main(String[] args) {
		

	}
	public static void permute(int[] arr, int idx) {
		  
		  if (idx == arr.length - 1) {
		   System.out.println(Arrays.toString(arr));
		   return;
		  }

		  for (int i = idx; i < arr.length; i++) {
		   
		   swap(arr, idx, i);
		   permute(arr, idx + 1);
		   swap(arr, idx, i);
		  }

		 }
		 public static void swap(int[] array, int i, int j) {
		        int buff = array[i];
		        array[i] = array[j];
		        array[j] = buff;
		    }

}
