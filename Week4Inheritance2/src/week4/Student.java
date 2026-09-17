package week4;

import java.time.LocalDate;

public class Student extends Person {
	// Extra attribute unique to Student
	private String programme;

	// Constructor: call super(...) first, then own fields
	public Student(String name, LocalDate dateOfBirth, int startYear, String address, String programme) {
		super(name, dateOfBirth, startYear, address); // calls Person constructor
		System.out.println("Child Constructor  Student with 5 parameters - 4 set by parent");
		setProgramme(programme);
	}

	// Getters/Setters for subclass attribute
	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {

		if (programme == null || programme.isBlank()) {
			this.programme = "Undeclared";
		} else {
			this.programme = programme.trim();
		}

		/*
		 * it can also be written using the short version of if/else uses the ternary
		 * operator ?: if the condition is true, use the first value; otherwise, use the
		 * second value.
		 */
		// this.programme = (programme == null || programme.isBlank()) ? "Undeclared" :
		// programme.trim();
	}

	// OVERRIDES Person.toString() to add Student-specific info
	@Override
	public String toString() {
		// Re-use Person’s formatting via super.toString()
		return super.toString() + ", programme='" + programme + "'";
	}
}
