package lesson2;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("text2.txt");
		
		char [] buff = new char [20];
		int count;
		
		
		StringBuilder builder = new StringBuilder();//динамичесская строка, которую можно изменять
		
		while((count = reader.read(buff)) != -1){
			builder.append(buff, 0, count);
		}
		
		String result = builder.toString();
		System.out.println(result);
		
		
//		int count = reader.read(buff);
//		System.out.println(count);
//		System.out.println(buff);
//		
//		System.out.println(reader.read(buff));
		
		
		
//		int ch;
//		String res = "";
//		while((ch = reader.read()) != -1){
//			res = res + (char)ch;
//			
//		}
//		System.out.println(res);
		
		
		
		
//		while(true){
//			int ch = reader.read();
//			if(ch == -1){
//				break;
//			}
//			System.out.print((char)ch);
//			
//		}
		
		
		
		
		/*		for(int i = 0; i < 10000; i++){
			int ch = reader.read();
			System.out.println(ch);
		}*/
		
		
		

	}

}
