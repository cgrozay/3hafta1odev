
public class Company extends Customer {
	private String companyName;
	private String taxNumber;

	public Company() {
		
	}

	public Company(String companyName, String taxNumber) {
		
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}
