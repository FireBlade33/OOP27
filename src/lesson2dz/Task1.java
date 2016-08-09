package lesson2dz;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter("text4.txt");
		
		for(int i = 0; i < 20; i++){
			writer.println("FuCk");
		}
		writer.flush();
		writer.close();
		
		FileReader reader = new FileReader("text4.txt");
		
		for(int i = 0; i < 20; i ++){
			int ch = reader.read();
		}
		
		

	}

}
