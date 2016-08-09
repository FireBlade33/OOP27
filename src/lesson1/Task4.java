package lesson1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task4 {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("text.txt", true);//такая себе трубка между джавой и файлом, сливает данные с джавы в этот файл
		//внимательно быть со "/" - записывать именнно так
		//доставляем после пути true, если надо дописать данные в уже заполненный файл, все наши данные запишутся после уже существующих
		
		
		for(int i = 0; i < 1000; i++){
			writer.write("Hello World");
			writer.write(System.lineSeparator());
		}
		
		writer.flush();//все оставшиеся эллементы в буфере дописываются, 
		writer.close();//удаляется наша трубочка, после клоуса мы не можем использовать этот writer - он удален!!!
	}

}
