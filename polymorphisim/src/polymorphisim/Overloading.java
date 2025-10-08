package polymorphisim;

 class Calculator {
	
	int add(int a , int b) {
		return  a+b;
		
	}

	int add(int a , int b, int c) {
		return  a+b+c;
		
	}

	double add(double a , double b) {
		return  a+b;
		
	}
	

}

public class Overloading{
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("sum of two integers ="  +calc.add(7,17 ));
		System.out.println("sum of three intergers ="  +calc.add(7,17,18));
		System.out.println("sum of two doubles ="  +calc.add(18,17));
	}
}
