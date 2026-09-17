package week8;

/**
 * Represents a general book item that extends the libraryItem 
 * provides author of the book and inherits title
 * @author James OBrien
 * @param title
 * @param author
 * @return loanDays, book description
 */
public class Book extends LibraryItem {
    private final String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public int getLoanDays() { return 21; }

    @Override
    public String describe() {
        return super.describe() + " (Book by " + author + ")";
    }
}
