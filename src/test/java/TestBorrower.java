import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower;
    HashMap<String, String> book;
    Library library;


    @Before
    public void before(){
        library = new Library(2);

        book = new HashMap<String, String>();
        book.put("title", "Squash and a Squeeze");
        book.put("author", "Julia Donaldson");
        book.put("genre", "Children");
        library.addBook(book);

        borrower = new Borrower();
    }

    @Test
    public void testNumberOfBooksBorrowedFunction (){
        assertEquals(0, borrower.numberOfBooksBorrowed());
    }

    @Test
    public void checkNumberOfBooksBorrowed(){
        borrower.checkBookOut(book);
        assertEquals(1, borrower.numberOfBooksBorrowed());
    }
}
