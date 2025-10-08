package data_abstraction;

public class cash_payment extends payment_gateway{
      
	@Override
	void pay(int amount)
	{
		System.out.println("paid using cash"+amount);
	}

}
