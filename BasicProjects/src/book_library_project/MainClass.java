package book_library_project;

import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		Random r= new Random();
		Book b=new Book();
		b.bv=new  BookValidate(r.nextInt(999), 299, 100, "SQL_HTML", "ef codd");
		b.bv.display();
	}
}
