package lesson2;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("text2.txt");
		
		Scanner scan = new Scanner(reader);
		
		while(scan.hasNextLine()){//есть ли что считывать в файле или нету (метод)
			System.out.println(scan.nextLine());
		}
		

	}

}
