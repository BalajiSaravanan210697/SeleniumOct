package week1.homeassignments;

public class LibraryManagement {

	public static void main(String[] args) {

		Library Librarian = new Library();
		Librarian.addBook("Java Basic Concepts");
		Librarian.issueBook();
		System.out.println(Librarian.addBook("Java Basic Concepts"));

	}

}
