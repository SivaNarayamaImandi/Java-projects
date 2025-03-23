package book_library_project;

public class BookValidate {
	private int bookId;
	private int bookCost;
	private int bookNoOfPages;
	private String bookTitle;
	private String bookAuthor;

	public BookValidate(int bookId, int bookCost, int bookNoOfPages, String bookTitle, String bookAuthor) {
		this.bookId = bookId;
		if (bookCostValidate(bookCost)) {
			this.bookCost = bookCost;
		} else {
			System.out.println("Data MissMatch");
		}
		if (bookNoOfPagesValidate(bookNoOfPages)) {
			this.bookNoOfPages = bookNoOfPages;
		} else {
			System.out.println("Data MissMatch");
		}
		if (bookTitleValidate(bookTitle)) {
			this.bookTitle = bookTitle;
		} else {
			System.out.println("Data MissMatch");
		}
		if (bookAuthorValidate(bookAuthor)) {
			this.bookAuthor = bookAuthor;
		} else {
			System.out.println("Data MissMatch");
		}
	}

	private boolean bookTitleValidate(String bookTitle) {
		String[] split = bookTitle.split("_");
		if (split.length == 2) {
			if (bookTitle.length() > 7) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private boolean bookCostValidate(int bookCost) {
		if (bookCost >= 200 && bookId <= 1000) {
			return true;
		} else {
			return false;
		}
	}

	private boolean bookNoOfPagesValidate(int bookNoOfPages) {
		if (bookNoOfPages >= 100 && bookNoOfPages <= 400) {
			return true;
		} else {
			return false;
		}
	}

	private boolean bookAuthorValidate(String bookAuthor) {
		String[] split = bookAuthor.split(" ");
		if (split.length == 2) {
			return true;
		} else {
			return false;
		}
	}
	public void display() {
		System.out.println("BOOK ID			: " + bookId);
		System.out.println("BOOK COST		: " + bookCost);
		System.out.println("BOOK No OF PAGES	: " + bookNoOfPages);
		System.out.println("BOOK TITLE		: " + bookTitle);
		System.out.println("BOOK AUTHOR		: " + bookAuthor);
	}
}
