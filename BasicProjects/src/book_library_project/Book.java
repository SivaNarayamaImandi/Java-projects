package book_library_project;

public class Book {
	private int bookId;
	private int bookCost;
	private int bookNoOfPages;
	private String bookTitle;
	private String bookAuthor;
	BookValidate bv;
	
//	public Book(int bookId, int bookCost, int bookNoOfPages, String bookTitle, String bookAuthor, BookValidate bv) {
//		this.bookId = bookId;
//		this.bookCost = bookCost;
//		this.bookNoOfPages = bookNoOfPages;
//		this.bookTitle = bookTitle;
//		this.bookAuthor = bookAuthor;
//		this.bv = bv;
//	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public int getBookNoOfPages() {
		return bookNoOfPages;
	}

	public void setBookNoOfPages(int bookNoOfPages) {
		this.bookNoOfPages = bookNoOfPages;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "\nBOOK ID			: " + bookId + "\nBOOK COST		: " + bookCost + "\nBOOK No OF PAGES	: "
				+ bookNoOfPages + "\nBOOK TITLE		: " + bookTitle + "\nBOOK AUTHOR		: " + bookAuthor;
	}

	public void display() {
		System.out.println("BOOK ID			: " + getBookId());
		System.out.println("BOOK COST		: " + getBookCost());
		System.out.println("BOOK No OF PAGES	: " + getBookNoOfPages());
		System.out.println("BOOK TITLE		: " + getBookTitle());
		System.out.println("BOOK AUTHOR		: " + getBookAuthor());
	}
}
