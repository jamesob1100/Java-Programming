/*
 * Book.java
 * TU856/2 TU858/2 Object-Oriented Programming Lab
 *
 * This class represents a Book object with three attributes:
 * ISBN number, title, and author.
 * 
 * It includes:
 *  - Constructors to create new Book objects
 *  - A toString() method to display details of a book in a readable way
 *  - A titleLength() method that uses the String length() method
 *
 * Author: Colette Kirwan
 * Date: 28/09/2025
 */

package w2;

public class Book {

    // Attributes (fields) for each book
    int m_isbn;        // the ISBN number of the book
    String m_title;    // the title of the book
    String m_author;   // the author of the book

    // Default constructor (creates an empty book object)
    public Book() {
    }

    // Constructor with two parameters: ISBN and title
    public Book(int isbn, String title) {
        m_isbn = isbn;
        m_title = title;
    }

    // Constructor with three parameters: ISBN, title, and author
    public Book(int isbn, String title, String author) {
        m_isbn = isbn;
        m_title = title;
        m_author = author;
    }

    // Method to return a string with the book's details
    // This overrides the default toString() method in Java
    @Override
    public String toString() {
        // Build a readable version of the attributes
        return "Book [ISBN=" + m_isbn + ", Title=" + m_title + ", Author=" + m_author + "]";
    }

    // Method to return the length of the title
    // Uses the built-in String method length()
    public int titleLength() {
        return m_title.length();
    }
}