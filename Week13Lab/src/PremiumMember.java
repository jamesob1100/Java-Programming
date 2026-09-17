
public class PremiumMember extends LibraryMember {

	
	
	public PremiumMember(String name, int age, int phoneNumber, String address, int membershipFee) {
		super(name, age, phoneNumber, address, membershipFee);
	}

	@Override
	public void printFee() {
		System.out.println("Premium Member Fee is €" + (0.9 * 100));
	}

	@Override
	public String toString() {
		return "PremiumMember [getAge()=" + getAge() + ", getPhoneNumber()=" + getPhoneNumber() + ", getAddress()="
				+ getAddress() + ", getMembershipFee()=" + getMembershipFee();
	}

	
	
}
