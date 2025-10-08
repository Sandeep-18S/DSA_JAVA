package data_abstraction;

class credit_card_payment extends payment_gateway {
	@Override
	void pay(int amount)
	{
		System.out.println("paid $ " +amount + "using credit card");
		
	}
}
