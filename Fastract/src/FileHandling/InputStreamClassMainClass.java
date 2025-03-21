package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InputStreamClassMainClass {
	public static void main(String[] args) {
		InputStreamClass ic = new InputStreamClass("Siva", 123, 10000, "HYD");
		try {
			FileOutputStream fos = new FileOutputStream("jsp.txt");
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(ic);
				oos.flush();
				oos.close();
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
