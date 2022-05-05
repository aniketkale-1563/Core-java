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
		
		
		
		///Multiple Catch Block
		
		try {
			int a1=10;
			System.out.println("a="+a1);
			int b=45/a1;
			int c[]= {1};
			c[45]=99;
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Div by 0:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Div by 0:"+e);
		}
		catch(Exception e) 
		{
			System.out.println("Exception e:"+e);
		}
		

	}

}
