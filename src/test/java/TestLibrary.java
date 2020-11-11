import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library library;
    private HashMap book1;
    private HashMap book2;
    private HashMap book3;


    @Before
    public void before(){
        library = new Library(2);

        book1 = new HashMap<String, String>();
        book1.put("title", "Squash and a Squeeze");
        book1.put("author", "Julia Donaldson");
        book1.put("genre", "Children");

        book2 = new HashMap<String, String>();
        book2.put("title", "Room on the Broom");
        book2.put("author", "Julia Donaldson");
        book2.put("genre", "Children");

        book3 = new HashMap<String, String>();
        book3.put("title", "The Shinning");
        book3.put("author", "Stephen King");
        book3.put("genre", "Horror");

    }

    @Test
    public void testABookCanBeAddedCapacityAvailable(){
        library.addBook(book1);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void testBookCannotBeAddedWhenAtFullCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.numberOfBooks());
    }


}



