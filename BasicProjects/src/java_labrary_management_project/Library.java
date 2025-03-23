package java_labrary_management_project;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	public Book b;

	ArrayList<Book> book = new ArrayList<Book>();

	// Add Book
	public void addBook(Book b) {
		book.add(b);
		System.out.println("\nBook Added Successfully.........");
	}

	// Display Book
	public void showBook() {
		if (book.isEmpty())
			System.out.println("No Books Are Added");
		else
			book.forEach((book) -> System.out.println((book)));
	}

	// Search Book Based On Id
	public void searchBookId(int id) {
		boolean isFound = false;
		if (book.isEmpty())
			System.out.println("No Books Are Added");
		else
			for (Book book2 : book) {
				if (book2.getBookId() == id) {
					book2.display();
					isFound = true;
				}
			}
		if (isFound == false)
			System.out.println("Invalid Id");
	}

	// Search Book Based On Author
	public void searchBookAuthor(String author) {
		boolean isFound = false;
		if (book.isEmpty())
			System.out.println("No Books Are Added");
		else
			for (Book book2 : book) {
				if (book2.getBookAuthor().equalsIgnoreCase(author)) {
					book2.display();
					isFound = true;
				}
			}
		if (isFound == false)
			System.out.println("Invalid Id");
	}

	// Update book Based On Id
	public void updateBookId(int id, int amount) {
		boolean isFound = false;
		if (book.isEmpty())
			System.out.println("No Books Are Added");
		else
			for (Book book2 : book) {
				if (book2.getBookId() == id) {
					book2.setBookCost(amount);
					System.out.println("Book Cost Updated Successfully.........");
					isFound = true;
				} else {
					System.out.println("Invalid Id");
				}
			}
		if (isFound == false)
			System.out.println("Invalid Id");
	}

	// Remove Book Based On NoOfPages
	public void removeBookNoOfPages(int noOfPages) {
		boolean isFound = false;
		Iterator<Book> i = book.iterator();
		while (i.hasNext()) {
			Book b = i.next();
			if (b.getBookNoOfPages() == noOfPages) {
				i.remove();
				System.out.println("Book Removed Successfull.........");
				isFound = true;
			}
		}
		if (isFound == false)
			System.out.println("Invalid No Of Pages");
	}

	// Design
	public void design() {
		String s = "****** WELCOME TO THE JAVA LIBRARY ******\n";
		for (int i = 0; i < s.length(); i++) {
			try {
				Thread.sleep(100);
				System.out.print(s.charAt(i));
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
		}
	}
}
