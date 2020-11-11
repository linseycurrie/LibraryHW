import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Borrower {

    private ArrayList<HashMap> borrowedBooks;
    private Library library;


    public Borrower(){
        borrowedBooks = new ArrayList<HashMap>();
        library = new Library(2);
    }

    public int numberOfBooksBorrowed(){
        return this.borrowedBooks.size();
    }

    public void checkBookOut(HashMap<String, String> book){
        this.library.removeBook(book);
        this.borrowedBooks.add(book);
    }


}
