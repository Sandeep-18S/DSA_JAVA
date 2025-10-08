package data_abstraction;


  abstract class payment_gateway {
	
	abstract void pay(int amount);
	void showpaymentgateway()
	{
		System.out.println("using secure payment gateway");
	}

}



