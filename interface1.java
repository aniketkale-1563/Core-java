package myproject;
interface AA
{
	void print();
	int i=25;
	
}
interface BA
{
	void show();
}
public class interface1 implements AA, BA{
	public void print() 
	{
		System.out.println("Hii");
	}
	@Override
	public void show() 
	{
	
		System.out.println("By");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		interface1 ob=new interface1();
		ob.print();
		ob.show();	
		}

	
}
