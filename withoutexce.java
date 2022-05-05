package myproject;

public class withoutexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,a;
		try {
			a=55/d;
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Div by zero");
		}
		System.out.println("Will Not Print");
		

	}

}
