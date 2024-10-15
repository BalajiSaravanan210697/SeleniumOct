package week1.homeassignments;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println(bookTitle + " " + "Book added successfully.");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {

		Library library = new Library();
		library.addBook("Fundamendals of Java");
		library.issueBook();

	}

}
