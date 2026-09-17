/*
 * TemperatureConverter: converting temperatures
 * Author: James OBrien
 * Date: 23.09.25
 */

package ie.tudublin.cmpu2016.lab1;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			System.out.println("Enter Celsius: ");
			double c = sc.nextDouble();
			double f = (c*9.0/5.0)+32.0;
			System.out.println("Farenheit = "+f);
		}
		sc.close();
		
		
	}

}
