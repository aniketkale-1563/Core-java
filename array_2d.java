package myproject;
import java.util.*;

public class array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mm=new Scanner(System.in);
		System.out.println("Enter no. of row");
		int row=mm.nextInt();
		System.out.println("Enter no. of column");
		int column=mm.nextInt();
		
		int matrix[][]	=new int[row][column];
		
		//input
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) 
			{
				matrix[row][column]=mm.nextInt();
			}
		}

		//output
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) 
			{
				System.out.println(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}

}
