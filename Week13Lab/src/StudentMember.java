
public class StudentMember extends LibraryMember {

	private String course;
	
	public StudentMember(String name, int age, int phoneNumber, String address, int membershipFee, String course) {
		super(name, age, phoneNumber, address, membershipFee);
		setCourse(course);
	}


	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "StudentMember [course=" + course + ", getAge()=" + getAge() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getAddress()=" + getAddress() + ", getMembershipFee()=" + getMembershipFee();
	}
	
	
	
	
}
