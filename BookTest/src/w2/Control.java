/*
 * Control.java
 * TU856/2 TU858/2 Object-Oriented Programming Lab
 *
 * This is the main program used to test the Book class.
 * It demonstrates:
 *  - Creating Book objects using different constructors
 *  - Printing object details using toString()
 *  - Using the titleLength() method (which calls the String length() method)
 *
 * Author: Colette Kirwan
 * Date: 28/09/2025
 */

package w2;

public class Control {
    public static void main(String[] args) {
        
        // Create a Book object using the constructor with ISBN + title
        Book javabook = new Book(1234567, "TUD Learning Java");

        // Create another Book object using the constructor with all fields
        Book b1 = new Book(12345, "Java Basics", "Alice Smith");

        // Print the details of the books
        // The toString() method makes the output easy to read --(when you print the object - toString() is called behind the scenes)
        System.out.println(javabook);
        System.out.println(b1); // Note: println() automatically calls toString() so you don’t need to write b1.toString()

        // Use the titleLength() method to find out how many characters are in the title
        System.out.println("Title length of '" + b1.m_title + "' is: " + b1.titleLength());

        // creating more Book objects with different values
        Book b2 = new Book(54321, "Advanced Java", "Bob Jones");
        System.out.println(b2);
        
        //customer 1
        Customer num1 = new Customer("Bobby", "O'Callaghan", "Gorey");
        //customer 2
        Customer num2 = new Customer("Jamie", "Mason", "Dublin");
        //customer 3
        Customer num3 = new Customer("Tadgh", "O'Mahoney", "Dublin", 003, 02);
        //customer 4
        Customer num4 = new Customer("James", "O'Brien", "Dublin", 004, 21);
        
        //Print the details of Customer and length of first name
        System.out.println(num1);
        System.out.println("Name length of '" + num1.m_fName + "' is: " + num1.nameLength());
        System.out.println(num2);
        System.out.println("Name length of '" + num2.m_fName + "' is: " + num2.nameLength());
        System.out.println(num3);
        System.out.println("Name length of '" + num3.m_fName + "' is: " + num3.nameLength());
        System.out.println(num4);
        System.out.println("Name length of '" + num4.m_fName + "' is: " + num4.nameLength());
        
    }
}