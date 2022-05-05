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
		
		
		try 
		{
			int mynum[]= {10,4,8,26,46};
			System.out.println(mynum[5]);
		}
		catch(Exception e) 
		{
			System.out.println("Element doesn't exist");
		}
		

	}

}
