/*
 * Customer.java
 * This class represents a Customer object with five attributes:
 * firstName, surname, city, customerNumber, loyaltyPoints 
 * 
 * It includes:
 *  - Two constructors; one to set first name, surname, and city, and one to set all attributes
 *  - A toString() method to display details of a customer in a readable way
 *  - A fNameLength() method that uses the String length() method
 *
 * Author: James OBrien
 * Date: 30/09/2025
 */

package w2;

public class Customer {
	
	//Attributes for customer
	String m_fName;
	String m_sName;
	String m_city;
	int m_customerNum;
	int m_loyaltyP;
	
	//Constructor with just first name, surname, and city
	public Customer (String fName, String sName, String city) {
		m_fName = fName;
		m_sName = sName;
		m_city = city;
	}
	
	//Constructor with all five attributes
	public Customer(String fName, String sName, String city, int customerNum, int loyaltyP)
	{
		m_fName = fName;
		m_sName = sName;
		m_city = city;
		m_customerNum = customerNum;
		m_loyaltyP = loyaltyP;
	}
	
	//Method to return string with customer details
	@Override
	public String toString() {
        // Build a readable version of the attributes
        return "Customer Name =" + m_fName + ", Surname=" + m_sName + ", City=" + m_city + ", Customer Number=" +m_customerNum +", Loyalty Points=" + m_loyaltyP + "]";
    }
	
	//Method to return string length of first name
	public int nameLength() {
        return m_fName.length();
	}
}

