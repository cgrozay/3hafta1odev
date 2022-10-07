
public class Main {

	public static void main(String[] args) {
		CreditManager creditManager=new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Çağrı");
		customer.setLastName("Özay");
		customer.setNationalIdentity("12345678");
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.Save(customer);
	}

}
