
public class TeacherCreditManager extends BaseCreditManager implements CreditManagerDao {

	@Override
	public double Calculate(double... numbers) {
		double total = 1;
		for (double number : numbers) {
			total = total * number;
		}

		return total;

	}

}
