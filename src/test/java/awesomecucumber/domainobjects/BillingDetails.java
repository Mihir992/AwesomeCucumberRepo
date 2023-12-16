package awesomecucumber.domainobjects;

public class BillingDetails {
	
	private String billingFirstName;
	private String billingLastName;
	private String billingEmail;
	private String billingAddressline;
	private String billingCity;
	private String billingState;
	private String billingZipCode;
	
	public BillingDetails(String billingFName,
			String billingLName,String billingemail,String billingAddress,String billingCty,
			String billingstate,String billingZip) {
		this.billingFirstName = billingFName;
		this.billingLastName = billingLName;
		this.billingEmail = billingemail;
		this.billingAddressline = billingAddress;
		this.billingCity = billingCty;
		this.billingState = billingstate;
		this.billingZipCode = billingZip;
	}

	public String getBillingFirstName() {
		return billingFirstName;
	}

	public void setBillingFirstName(String billingFName) {
		this.billingFirstName = billingFName;
	}

	public String getBillingLastName() {
		return billingLastName;
	}

	public void setBillingLastName(String billingLName) {
		this.billingLastName = billingLName;
	}

	public String getBillingEmail() {
		return billingEmail;
	}

	public void setBillingEmail(String billingemail) {
		this.billingEmail = billingemail;
	}

	public String getBillingAddressline() {
		return billingAddressline;
	}

	public void setBillingAddressline(String billingAddress) {
		this.billingAddressline = billingAddress;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCty) {
		this.billingCity = billingCty;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingstate) {
		this.billingState = billingstate;
	}

	public String getBillingZip() {
		return billingZipCode;
	}

	public void setBillingZip(String billingZip) {
		this.billingZipCode = billingZip;
	}
}
