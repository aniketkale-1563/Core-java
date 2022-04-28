package myproject;
///default Constructor
class student
{
	int id;
	String name;
	student()
	{
		id=10;
		name="ABC";
		System.out.println(name+" "+id);
	}
}

///parameterized constructor
class example
{
	example()
	{
		System.out.println("Default Constructor");
	}
	example(int i, int j)
	{
		System.out.println("Constructor with two parameter" + i+ j);
	}
	example(int i, int j,int k)
	{
		System.out.println("Constructor with three parameter" +i+j+k);
	}
	example(int i, String j)
	{
		System.out.println("Constructor with int& String  parameter"+i+j);
	}
}

public class constructor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		student s1=new student();
		
		//this will invoke default constructor
		example obj=new example();
		
		//this will invoke with 2 parameter
		example obj2=new example(10,20);
		
		//this will invoke with 3 parameter
		example obj3=new example(10,20,52);
		
		//this will invoke with int & string parameter
		example obj4=new example(10,"ABC");
		
		
		
		
		
		

	}

}
