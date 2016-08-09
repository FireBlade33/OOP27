package lesson2;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 {

	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter("text2.txt");//более удобный и имеет больше методов
		
		
		for(int i = 0; i < 1000; i++){
			writer.println("line " + i);
		}
		
		writer.flush(); 
		writer.close();
		

	}

}
