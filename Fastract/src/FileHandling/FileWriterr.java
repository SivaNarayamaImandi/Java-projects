package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("abc.txt");
			fw.write("Hello World....");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Handled...");
		}
	}
}
