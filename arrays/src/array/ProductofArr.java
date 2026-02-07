package array;
import java.util.Scanner;
public class ProductofArr {

	 

		public static void main(String[] args){
				Scanner in=new Scanner(System.in);		
				
					System.out.println("Enter the size of the array: ");
					int size=in.nextInt();
					int[] arr=new int[size];
					System.out.println("Enter the input");
					int pro=1;
					for (int i=0;i<size;i++) {
						
						arr[i]=in.nextInt();
	                 }
					for ( int i=0;i<size;i++) { 
						
						 pro=pro*arr[i];
					
	}
					
					System.out.println(pro);
				
	}
	}