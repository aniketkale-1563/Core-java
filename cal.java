package myproject;

public class cal 
{
	int add(int a,int b) 
	{
		return a+b;
	}
	int add(int a,int b,int c) 
	{
		return a+b+c;
	}

	public static void main(String[] args) 
	{
       cal ob=new cal();
       System.out.println(ob.add(5,3));
       System.out.println(ob.add(5,3,8));
	}

}
