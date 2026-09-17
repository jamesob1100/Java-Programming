public class LibraryMember {
	
	private String name;
	private int age;
	private int phoneNumber;
	private String address;
	private int membershipFee;
	
	public LibraryMember(String name, int age, int phoneNumber, String address, int membershipFee) {
		setName(name);
		setAge(age);
		setPhoneNumber(phoneNumber);
		setAddress(address);
		setMembershipFee(membershipFee);
	}
	

	public void setName(String name) {
		if (name == null || name.isBlank()) {
			this.name = "Unknown";
		} else {
			this.name = name.trim();
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMembershipFee() {
		return membershipFee;
	}

	public void setMembershipFee(int membershipFee) {
		this.membershipFee = membershipFee;
	}

	
	public void printFee() {
		System.out.println("Membership Fee is €" + membershipFee);
	}
	
	
	@Override
	public String toString() {
		return "LibraryMember [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", membershipFee=" + membershipFee + "]";
	}
	
	
	
	

}
