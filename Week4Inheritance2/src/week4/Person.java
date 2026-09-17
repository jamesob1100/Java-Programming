package week4;

import java.time.LocalDate;

public class Person {
	// Core attributes (private: not directly visible in subclasses)
	private String name;
	private LocalDate dateOfBirth;
	private int startYear;
	private String address;

	// Full constructor — uses setters (so validation runs in one place)
	public Person(String name, LocalDate dateOfBirth, int startYear, String address) {
		System.out.println("Parent Constructor with 4 parameters");
		setName(name);
		setDateOfBirth(dateOfBirth);
		setStartYear(startYear);
		setAddress(address);
	}

	// -------- Getters & Setters (simple gatekeeping) --------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isBlank()) {
			this.name = "Unknown";
		} else {
			this.name = name.trim();
		}
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		// Keep it simple for teaching: allow null, else assign
		this.dateOfBirth = dateOfBirth;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		// Very light guard
		if (startYear < 1980) {
			this.startYear = 1980;
		} else {
			this.startYear = startYear;
		}

		/*
		 * it can also be written using the short version of if/else uses the ternary
		 * operator ?: if the condition is true, use the first value; otherwise, use the
		 * second value.
		 */

		// this.startYear = (startYear < 1900) ? 1900 : startYear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {

		if (address == null || address.isBlank()) {
			this.address = "No address";
		} else {
			this.address = address.trim();
		}

		/*
		 * it can also be written using the short version of if/else uses the ternary
		 * operator ?: if the condition is true, use the first value; otherwise, use the
		 * second value.
		 */
		// this.address = (address == null || address.isBlank()) ? "No address" :
		// address.trim();
	}

	// Example method: calculates age based on dateOfBirth
	public int calculateAge() {
		if (dateOfBirth == null)
			return 0;
		return LocalDate.now().getYear() - dateOfBirth.getYear();
	}

	// Example method: returns a short summary (can be reused by subclasses)
	public String getSummary() {
		return name + " (" + calculateAge() + " yrs), started in " + startYear;
	}

	// -------- Overridable behaviour --------
	// toString is inherited by subclasses; they can override it
	@Override
	public String toString() {
		return "Person{name='" + name + "', address='" + address + "', dateOfBirth=" + dateOfBirth + ", startYear="
				+ startYear + "}";
	}
}