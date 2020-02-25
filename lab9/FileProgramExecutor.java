package lab9;


import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgramExecutor {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();	//using executor
		
		try{
		String inputPath = "D:\\a\\Vj1.txt";
		Reader reader = new FileReader(inputPath);
		String outputPath ="D:\\\\a\\\\Vj2.txt";
		Writer  writer = new FileWriter(outputPath);
		
		Runnable thread1 = new CopyDataThread(reader,writer);
		executor.submit(thread1);
		
		}
		
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}