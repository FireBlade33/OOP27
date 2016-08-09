package lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Task4 {

public static void main(String[] args) throws IOException {

System.out.println("Enter path to file : ");

BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
String inputFilePath = bufferRead.readLine();
System.out.println(inputFilePath);
File sourceFile =new File(inputFilePath);

System.out.println("Enter text : ");

new PrintWriter(sourceFile).append(bufferRead.readLine()).close();

System.out.println("Enter path to copy-file : ");
String outputFilePath = bufferRead.readLine();
System.out.println(outputFilePath);
File copyFile =new File(outputFilePath);

InputStream inStream = new FileInputStream(sourceFile);
OutputStream outStream = new FileOutputStream(copyFile);

byte[] buffer = new byte[1024];

int length;
while ((length = inStream.read(buffer)) > 0){

outStream.write(buffer, 0, length);

}

inStream.close();
outStream.close();

System.out.println("File is copied successful!");

}
}