package CRM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private long addressId;
private String city;
private String state;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
private String pincode;

@OneToOne
private Customer customer;
public long getAddressId() {
	return addressId;
}
public void setAddressId(long addressId) {
	this.addressId = addressId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}

}
