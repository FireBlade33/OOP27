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
		
		list.add(1, 999);//���������� � �������� ��� �������� 2 ��������, ��������� ������� ���� �� ����� ���������� ������
		
		System.out.println(list);
		
		list.set(3, 567);//��������� �������� ��� �������� ��� ������� ��� �� ����� �� ���, ��� �� �������
		
		System.out.println(list);
		
		list.remove(1);//������� �������� ��� �������� ��������
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		System.out.println(list.contains(999));//���������� � ������ � ��������� ��������� �� ���� �������� � ��� ������, �� ��� ������, � ������ ��� ��������
		
		System.out.println(list.indexOf(777));//���������� ������ ��������� ���������� ���� ���������, ���� ��� �� ���������� - ������������ (-1)
        
		
	}
	
	public static int sum(int [] array){
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result = result + array[i];
		}
		return result;
	}

}
