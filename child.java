package myproject;
class parent
{
	void view() 
	{
		System.out.println("Parent class");
	}
	
}

public class child extends parent {
	void view() ///method overriding
	{
		System.out.println("child class");
		///
		super.view();
	}

	public static void main(String[] args) {
		///1.
		parent ob=new parent();
		ob.view();
		
		///2.
		child ob1=new child();
		ob1.view();
	
	}

}
