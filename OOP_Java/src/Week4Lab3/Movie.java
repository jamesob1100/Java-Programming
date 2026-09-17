/*
 * James OBrien
 * C24460046
 */

package Week4Lab3;

public class Movie {
	
	private String mtitle;
	private String mgenre;
	private int mdurationMinutes;
	
	
	public String getTitle() {
		return mtitle;
	}
	public void setTitle (String title) {
		this.mtitle = title.trim();
	}
	
	
	public String getGenre() {
		return mgenre;
	}
	public void setGenre(String genre) {
		this.mgenre = genre;
	}
	
	
	public int getdurationMinutes() {
		return mdurationMinutes;
	}
	public void setdurationMinutes(int durationMinutes) {
		if(durationMinutes >= 30 && durationMinutes <= 240)
			this.mdurationMinutes = durationMinutes;
		else
			System.out.println("Invalid Runtime");
	}
	
	
	public Movie (String title, String genre, int durationMinutes) {
		setTitle(title);
		setGenre(genre);
		setdurationMinutes(durationMinutes);
	}
	
	
	public String toString() {
        return "This movie is called " + getTitle() + " it is a " + getGenre() + " film and lasts " + getdurationMinutes() + " minutes.";
    }
	
	public String playTrailer() {
		if(getGenre().equals("Horror")) {
			return "Horrific horror trailer playing now!";
		}
		else if(getGenre().equals("Crime")) {
			return "Criminal crime trailer playing now!";
		}
		else if(getGenre().equals("Sci-Fi")) {
			return "Spacey Sci-Fi trailer playing now!";
		}
		else {
			return "Playing trailer now!";
		}
	}
}
