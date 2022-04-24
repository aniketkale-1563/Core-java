package myproject;
///1.single inheritance
class one
{
	void disp1() 
	{
	System.out.println("One");
	}
}
class two extends one
{
	void disp2() 
	{
	System.out.println("two");
	}
}

///2.Hierarchical Inheritance
class one1
{
 void disp1() 
  {
	System.out.println("One");
  }	
}
class two2 extends one1
{
 void disp2() 
  {
	System.out.println("two");
  }	
}
class three3 extends two2
{
 void disp3() 
  {
	System.out.println("three");
  }	
}
class four4 extends three3
{
 void disp4() 
  {
	System.out.println("four");
  }	
}


///3.Multilevel Inheritance
class A
{
 void disp1() 
 {
	System.out.println("One"); 
	 
 }	
}
class B extends A
{
 void disp2() 
 {
	System.out.println("Two");
	 
 }	
}
class C extends B
{
 void disp3() 
 {
	System.out.println("Three");
	 
 }	
}
class D extends C
{
 void disp4() 
 {
	System.out.println("Four");
	 
 }	
}





public class inheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("1.single inheritance");
		///1.single inheritance
		two obj =new two();
		obj.disp1();
		obj.disp2();
		
		System.out.println("_______________________");
		
		
		System.out.println("2.Hierarchical Inheritance");
		///2.Hierarchical Inheritance
		four4 obj1=new four4();
		obj1.disp4();
		obj1.disp1();
		
		three3 obj2=new three3();
		obj2.disp1();
		obj2.disp3();
		
		two2 obj3=new two2();
		obj3.disp1();
		obj3.disp2();
		
		///3.Multilevel Inheritance
		System.out.println("_______________________");
		System.out.println("3.Multilevel Inheritance");
		D object=new D();
		object.disp1();
		object.disp2();
		object.disp3();
		object.disp4();
		
		
	}

}
