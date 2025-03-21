package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
	public static void main(String[] args) {
		File f=new File("abc.txt");
		try {
			FileReader fr=new FileReader(f);
			try {
				for(int i=0;i<=f.length()-1;i++)
				{
					System.out.print((char)fr.read());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
