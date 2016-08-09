package lesson1;

import java.util.ArrayList;;

public class Task2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list.size());
		
		list.add(10);
		list.add(20);
		list.add(5);
		
		System.out.println(list);
		
		list.add(1, 999);//записывает в эллемент под индексом 2 ньювалуе, эллементы которые были до этого сдвигаются вправо
		
		System.out.println(list);
		
		list.set(3, 567);//заменяеэт эллемент под индексом два который был до этого на тот, что мы указали
		
		System.out.println(list);
		
		list.remove(1);//удаляет эллемент под указаным индексом
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		System.out.println(list.contains(999));//вызывается у списка и проверяет находится ли этот эллемент в сам списке, не его индекс, а именно сам эллемент
		
		System.out.println(list.indexOf(777));//возвращает индекс эллемента указанного нами эллемента, если его не существует - возвращается (-1)
        
		
	}
	
	public static int sum(int [] array){
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result = result + array[i];
		}
		return result;
	}

}
