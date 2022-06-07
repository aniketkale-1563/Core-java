package myproject;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		///1st program
		LocalDate currDate=LocalDate.now();
		System.out.println("Current Date is:-"+currDate);
		
		System.out.println("_______________________________");
		
		
		///2nd Program
		
		LocalDate currDate1=LocalDate.now();
		LocalDate yesterday=currDate1.minusDays(1);
		LocalDate Tomorrow=currDate1.plusDays(1);
		
		System.out.println("Current Date:- "+currDate1);
		System.out.println("Current Date:- "+yesterday);
		System.out.println("Current Date:- "+Tomorrow);
		
		System.out.println("_______________________________");
		
		///3rd program
		LocalDate currDate3=LocalDate.now();
		DayOfWeek dayofweek=currDate3.getDayOfWeek();
		int dayofMonth=currDate3.getDayOfMonth();
		int dayofyear=currDate3.getDayOfYear();
		
		
		System.out.println("Date:-"+currDate1);
		System.out.println("Day of Week :- "+dayofweek);
		System.out.println("Day of Week :- "+dayofMonth);
		System.out.println("Day of Week :- "+dayofyear);

	}

}
