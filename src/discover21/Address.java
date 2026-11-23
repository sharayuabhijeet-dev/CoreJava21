package discover21;

public record Address(int pincode,String city) {

	public int compareTo(Address address) {
		return Integer.compare(this.pincode, address.pincode);
	}}


