package data_abstraction;

public class main {
	public static void main(String[] args) {
		payment_gateway p1=new credit_card_payment();
		payment_gateway p2=new upi_payment();
		payment_gateway p3=new cash_payment();
		p1.showpaymentgateway();
		p1.pay(500);
		p2. showpaymentgateway(); 
		p2.pay(1000);
		p3. showpaymentgateway();
		p3.pay(1500);
		
		
	}
}
