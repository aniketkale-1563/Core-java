package myproject;
interface myinterface
{
public void m1();
public void m2();
int a=20;
}

public class interface2 implements myinterface  
{
public void m1() 
{
	System.out.println("Hiii");
	System.out.println("VAlue Of A is :"+a);
}
public void m2() 
{
	System.out.println("Byyy");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 ob=new interface2();
		ob.m1();
		ob.m2();
	}

}
