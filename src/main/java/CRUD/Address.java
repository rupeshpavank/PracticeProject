package CRUD;

public class Address {
	
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String ZipCode;
	public Address(String firstName, String lastName, String Address, String city, String zipCode) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Address = Address;
		this.City = city;
		this.ZipCode = zipCode;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	

}
