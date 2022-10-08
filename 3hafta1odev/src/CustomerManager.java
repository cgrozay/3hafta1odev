
public class CustomerManager {
	
	private CreditManagerDao creditManagerDao;
	private Customer customer;
	
	public CustomerManager(Customer customer,CreditManagerDao creditManagerDao) {
		this.creditManagerDao=creditManagerDao;
		this.customer=customer;
	}
	
	public void GiveCredit() {
		double result=creditManagerDao.Calculate(5,20,10);
		System.out.println("Kredi verildi ="+result);
	}

	public void Save(Customer customer) {
		System.out.println("Müşteri kaydedildi..."+customer.getId());
	}
	public void Delete(Customer customer) {
		System.out.println("Müşteri silindi..."+customer.getId());
	}
}
