package array;
import java.util.Scanner;
public class Array2D {


		public static void main(String[] args) {
			int size = 3;
			int[][] arr = new int[size][size];
			Scanner in = new Scanner(System.in);
			
			for(int row=0;row<size;row++)
			{
			    for(int col=0;col<size;col++)
			    {
			        arr[row][col]=in.nextInt();
			        
			    }
	
			}
			for(int row=0;row<size;row++)
			{
			    for(int col=0;col<size;col++)
			    {
			       
	        
			        if(row==col) {
			        	System.out.println(arr [row][col]);
			        	
			        }
			        
			    }
		}
			
			for(int row=0;row<size;row++)
			{
			    for(int col=0;col<size;col++)
			    {
			       // arr[row][col]=in.nextInt();
			        
			        if(row+col==size-1) {
			        	System.out.println(arr [row][col]);
			        }
			        
			    }
		}
			
			System.out.println("Data Stored Successfully");
	}
}
