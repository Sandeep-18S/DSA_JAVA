package data_abstraction;

 class upi_payment extends payment_gateway {
	@Override
	void pay(int amount)
	{
		System.out.println("paid using upi"+amount);
	}

}
