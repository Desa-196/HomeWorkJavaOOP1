package Task3;

public class Book {
    private IPrinter printer;
    private String title;
    private String author;
    private boolean available;

    /**
     * @return IPrinter return the printer
     */
    public IPrinter getPrinter() {
        return printer;
    }

    /**
     * @param printer the printer to set
     */
    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }
    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return boolean return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */

    public Book(String title, String author, boolean available, IPrinter printer){
        this.printer = printer;
        this.title = title;
        this.author = author;
        this.available = available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo(){
        printer.print(String.format("Название: %s \nАвтор: %s \nКнига %s\n", title, author, available?"Доступна":"Не доступна"));
    }


    

}
