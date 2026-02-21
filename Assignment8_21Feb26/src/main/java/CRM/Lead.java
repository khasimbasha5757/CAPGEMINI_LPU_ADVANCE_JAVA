package CRM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lead {
	@Id
	private long leadid;
private String source;
private String status;
@OneToOne
private Customer customer;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public long getLeadid() {
	return leadid;
}
public void setLeadid(long leadid) {
	this.leadid = leadid;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Lead [leadid=" + leadid + ", source=" + source + ", status=" + status + "]";
}

}
