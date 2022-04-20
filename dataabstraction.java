package myproject;
abstract class atm
{
	abstract void withdraw();
}
public class dataabstraction extends atm
{
	void withdraw() 
	{
		System.out.println("Withdrw Succesful");
	}

public static void main(String args[] ) 
{
dataabstraction ob=new dataabstraction();
ob.withdraw();
}
}
