package myproject;


public class polymorphism 
{

	void add(int x, int y) 
	{
		System.out.println("The Sum Of No.:-"+ (x+y));
	}
	void add(int x, int y, int z) 
	{
		System.out.println("The Sum Of No.:-"+ (x+y+z));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        polymorphism ob1=new polymorphism();
        ob1.add(2,5);
        ob1.add(2,5,6);
        
	}

}
