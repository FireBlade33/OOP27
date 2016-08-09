package lesson1;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(6);
		
		list.add(5);
		
		list.add(5);
		
		list.add(7);
		
		list.add(21);
		
//		list.removeIf((e) -> e % 2 != 0);
//
//		list.forEach((e) -> System.out.println(e));
//
//		list.removeIf((e) -> {
//			System.out.println(e);
//			return e % 2 != 0;
//		});
		
	System.out.println(list);
		

	}
	public static void removeAllOdd(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) % 2 != 0){
				list.remove(i);
				i--;
				
			}
			
		}
		
	}

}