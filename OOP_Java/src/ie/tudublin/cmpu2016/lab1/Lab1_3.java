/*
 * Lab1_3: Basic Java Constructs-- Conditionals, Loops, and Arrays
 * Author: James OBrien
 * Date: 23.09.25
 */

package ie.tudublin.cmpu2016.lab1;

public class Lab1_3 {
	
	public static void main(String[] args) {
		
		//conditionals
		int age = 17;
		if (age >= 18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Minor");
		}
		
		int day = 4;
		switch(day) {
		case 1 -> System.out.println("Mon");
		case 2 -> System.out.println("Tue");
		case 3 -> System.out.println("Wed");
		default -> System.out.println("Other");
		}
		
		for(int i = 0;i<5;i++) {
			System.out.println("i="+i);
		}
		
		int n = 3;
		while(n>0) {
			System.out.println("n=" +n);
			n--;
		}
		
		int x = 0;
		do {
			System.out.println("x="+x);
			x++;
		}while(x<2);
		
		//Arrays
		int[] scores = {72, 85, 90};
		System.out.println(scores[0]);
		System.out.println(scores.length);
		for(int s : scores) {
			System.out.println(s);
		}
		
	}

}
