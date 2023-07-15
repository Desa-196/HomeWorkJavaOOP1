package Task3;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book){
        catalog.add(book);
    }
    public void removeBook(Book book){
        catalog.remove(book);
    }
    public void displayAvailableBooks(){
        catalog.stream().filter(x -> x.isAvailable()).forEach(x -> x.displayInfo());
    }
    public void searchByAuthor(String author){
        catalog.stream().filter(x -> x.getAuthor().equals(author)).forEach(x -> x.displayInfo());
    }
}
