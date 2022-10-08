
public class Main {

	public static void main(String[] args) {
		
		
		
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setCity("Sivas");
		
		
		//CustomerManager customerManager=new CustomerManager(new Person(),new TeacherCreditManager());
		//customerManager.Save(customer);
		//customerManager.Delete(customer);
		
		CustomerManager customerManager2=new CustomerManager(new Company(),new TeacherCreditManager());
		customerManager2.Save(customer);
		customerManager2.Save(customer);
		customerManager2.GiveCredit();
		
		Company company=new Company();
		company.setTaxNumber("8837463663");
		company.setCompanyName("Arçelik");
		company.setId(1);
		company.setCity("Ankara");
		
		
		
		
		
		
	}

}
