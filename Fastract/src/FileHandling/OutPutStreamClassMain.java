package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OutPutStreamClassMain {
	public static void main(String[] args) {
		InputStreamClass ic = new InputStreamClass("Siva", 123, 10000, "HYD");
		try {
			FileInputStream fis=new FileInputStream("jsp.txt");
			try {
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
					InputStreamClass iis=(InputStreamClass)ois.readObject();
					System.out.println(iis.getName());
					System.out.println(iis.getId());
					System.out.println(iis.getSal());
					System.out.println(iis.getLoc());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
