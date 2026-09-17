package week8;

/**
 * represents a movie item which inherits from library item
 * @author James OBrien
 * @param director
 * @param title
 * @return loan days, description
 */
public class Movie extends LibraryItem {
    private final String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }
    
    //TODO Add the missing methods hint you must override them
    
    public String getDirector() {
		return director;
	}

	@Override
	public int getLoanDays() {return 7;}
	
	@Override
    public String describe() {
        return super.describe() + " (Movie by " + director + ")";
    }
}
