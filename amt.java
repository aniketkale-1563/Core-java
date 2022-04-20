package myproject;

class withdraw
{
	int amt_withdraw=2000;
}
public class amt extends withdraw {
	
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amt obj1=new amt();
		System.out.println("amt withdraw:-"+obj1.amt_withdraw);
		System.out.println("amt left:-"+obj1.amt_left);
		
	}

}
