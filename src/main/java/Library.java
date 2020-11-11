import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<HashMap> library;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity){
        library = new ArrayList<HashMap>();
        this.capacity = capacity;
        genreCount = new HashMap<String, Integer>();

    }

    public boolean checkCapacity(){
        if(library.size() < this.capacity){
            return true;
        }
        return false;
    }

    public void addBook(HashMap<String,String> book){
        if(this.checkCapacity()){
            this.library.add(book);
        }
    }

    public void removeBook(HashMap<String, String> book){
        if(this.library.contains(book)){
            int index = this.library.indexOf(book);
            this.library.remove(index);
        }
    }

    public int numberOfBooks(){
        return library.size();
    }

    public void addToGenreStockCount(){
        for(int i = 0; i < library.size(); i++){
            HashMap<String,String> book = this.library.get(i);
            String genre = book.get("genre");
            if(this.genreCount.containsValue(genre)){
                Integer count = this.genreCount.get(genre);
                this.genreCount.put(genre, (count+1));
            }else{
                this.genreCount.put(genre, 1);
            }
        }

    }
}
