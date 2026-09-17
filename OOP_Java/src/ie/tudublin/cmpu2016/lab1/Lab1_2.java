/*
 * Lab1_2: Basic Java Constructs
 * Author: James OBrien
 * Date: 23.09.25
 */

package ie.tudublin.cmpu2016.lab1;

public class Lab1_2 {
	
	public static void main(String[] args) {
		int count = 10;
		double price = 19.99;
		boolean isValid = true;
		char letter = 'A';
		String name = "Colette";
		
		System.out.println(count + ", " + price +", " + isValid +", " + letter + ", " + name);
		
		//Adding in arithmetic
		int a = 7, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		double c = 7.0;
		System.out.println(c / b);
	}
}
