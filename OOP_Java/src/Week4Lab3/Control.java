/*
 * James OBrien
 * C24460046
 */

package Week4Lab3;

public class Control {
	
	public static void main(String[] args) {
		Movie theShining = new Movie("The Shining", "Horror", 143);
		Movie spaceOdyssey = new Movie("2001: A Space Odyssey", "Sci-Fi", 149);
		Movie fullMetJack = new Movie("Full Metal Jacket", "War", 116);
		Movie eyeWiShu = new Movie("Eyes Wide Shut", "Thriller", 159);
		Movie clockOran = new Movie("A Clockwork Orange", "Crime", 136);
		
		System.out.println(theShining);
		theShining.setdurationMinutes(140);
		System.out.println(theShining.getdurationMinutes());
		//System.out.println(theShining.mtitle);
		System.out.println(theShining.playTrailer());
		System.out.println("\n");
		
		System.out.println(spaceOdyssey);
		System.out.println(spaceOdyssey.playTrailer());
		System.out.println("\n");
		
		System.out.println(fullMetJack);
		System.out.println(fullMetJack.playTrailer());
		System.out.println("\n");
		
		System.out.println(eyeWiShu);
		System.out.println(eyeWiShu.playTrailer());
		System.out.println("\n");
		
		System.out.println(clockOran);
		System.out.println(clockOran.playTrailer());
	}

}
