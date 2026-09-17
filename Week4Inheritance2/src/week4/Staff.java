package week4;

import java.time.LocalDate;

public class Staff extends Person {
	private String role; // different to Student
	private String schoolName; // different to Student

	public Staff(String name, LocalDate dateOfBirth, int startYear, String address, String role, String schoolName) {
		super(name, dateOfBirth, startYear, address);
		System.out.println("Child  Constructor  Staff with 6 parameters, 4 set by Parent");
		setRole(role);
		setSchoolName(schoolName);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {

		if (role == null || role.isBlank()) {
			this.role = "Staff";
		} else {
			this.role = role.trim();
		}
		
		/*
		 * it can also be written using the short version of if/else uses the ternary
		 * operator ?: if the condition is true, use the first value; otherwise, use the
		 * second value.
		 */
		// this.role = (role == null || role.isBlank()) ? "Staff" : role.trim();
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {

		if (schoolName == null || schoolName.isBlank()) {
			this.schoolName = "Unknown School";
		} else {
			this.schoolName = schoolName.trim();
		}
		/*
		 * it can also be written using the short version of if/else uses the ternary
		 * operator ?: if the condition is true, use the first value; otherwise, use the
		 * second value.
		 */
		// this.schoolName = (schoolName == null || schoolName.isBlank()) ? "Unknown
		// School" : schoolName.trim();
	}

	// OVERRIDES Person.toString() to append role + school
	@Override
	public String toString() {
		return super.toString() + ", role='" + role + "', schoolName='" + schoolName + "'";
	}
}