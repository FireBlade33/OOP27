package lesson1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task4 {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("text.txt", true);//����� ���� ������ ����� ������ � ������, ������� ������ � ����� � ���� ����
		//����������� ���� �� "/" - ���������� ������� ���
		//���������� ����� ���� true, ���� ���� �������� ������ � ��� ����������� ����, ��� ���� ������ ��������� ����� ��� ������������
		
		
		for(int i = 0; i < 1000; i++){
			writer.write("Hello World");
			writer.write(System.lineSeparator());
		}
		
		writer.flush();//��� ���������� ��������� � ������ ������������, 
		writer.close();//��������� ���� ��������, ����� ������ �� �� ����� ������������ ���� writer - �� ������!!!
	}

}
