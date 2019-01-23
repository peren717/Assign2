package assign02;

import java.util.GregorianCalendar;

/**
 * This class represents a library book, in which the ISBN, author, and title cannot
 * change once the book is created.  Note that ISBNs are unique.
 * 
 * @author Sheldon Jensen
 * @version January 16, 2019
 */

public class LibraryBook extends Book {

	private long isbn;

	private String author;

	private String title;
	
	private String holder;
	
	private GregorianCalendar dueDate;
	
	/**
	 * Creates a book from the given ISBN, author, and title.
	 * 
	 * @param isbn
	 * @param author
	 * @param title
	 */
	public LibraryBook(long isbn, String author, String title) {
		
		this.isbn = isbn;
		this.author = author;
		this.title = title;
	}
	
	/**
	 * Returns the current holder of the book
	 */
	public String getHolder() {
		return this.holder;
	}
	
	/**
	 * Returns the due date by which the holder must return the book
	 */
	public GregorianCalendar getDueDate() {
		return this.dueDate;
	}
	
	/**
	 * Checks the book into the library
	 */
	public void checkIn() {
		holder = null;
		dueDate = null;
	}
	
	/**
	 * Checks the book out of the library
	 */
	public void checkOut() {
		
	}
}
