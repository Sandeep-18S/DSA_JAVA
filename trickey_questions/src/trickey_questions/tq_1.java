package trickey_questions;

public class tq_1 
{
	tq_1(int a,int b)
	{
		System.out.println("a = " + a + ", b = "+ b);
	}
	tq_1(int a ,float b)
	{
		System.out.println("a = " + a +"b ="+ b);
	
	}
	public static void main(String[] args) {
		byte a=7;
		byte b=18;
		tq_1 test =new tq_1(a,b);
	}

}
