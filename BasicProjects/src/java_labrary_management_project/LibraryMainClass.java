package java_labrary_management_project;

import java.util.Random;
import java.util.Scanner;

public class LibraryMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library li = new Library();
		Random r = new Random();
		boolean start = true;
		li.design();
		while (start) {
			System.out.println(
					"Choose Options\n 1.Add Book\n 2.Display Book\n 3.Search Book Based On Id\n 4.Search Book Based On Author\n 5.Update Book Based On Id\n 6.Remove Book Based On No Of Pages\n 7.Exit");
			int choose = sc.nextInt();
			switch (choose) {
			case 1: {
				System.out.print("ENTER BOOK COST : ");
				int cost = sc.nextInt();
				System.out.print("ENTER BOOK NO OF PAGES : ");
				int noOfPages = sc.nextInt();
				System.out.print("ENTER BOOK TITLE : ");
				String title = sc.next();
				System.out.print("ENTER BOOK AUTHOR : ");
				String author = sc.next();
				li.addBook(new Book(r.nextInt(1000), cost, noOfPages, title, author));
			}
				break;
			case 2: {
				li.showBook();
			}
				break;
			case 3: {
				System.out.println("ENTER BOOK ID");
				li.searchBookId(sc.nextInt());
			}
				break;
			case 4: {
				System.out.println("ENTER AUTHOR NAME");
				li.searchBookAuthor(sc.next());
			}
				break;
			case 5: {
				System.out.println("ENTER BOOK ID");
				int id = sc.nextInt();
				System.out.println("ENTER UPDATED BOOK COST");
				int cost = sc.nextInt();
				li.updateBookId(id, cost);
			}
				break;
			case 6: {
				System.out.println("ENTER NO OF PAGES");
				li.removeBookNoOfPages(sc.nextInt());
			}
				break;
			case 7: {
				start = false;
				System.out.println("THANK YOU FOR VISITING .........");
			}
				break;
			default: {
				System.out.println("ENTER VALID OPTION");
			}
				break;
			}
		}
		sc.close();
	}
}
