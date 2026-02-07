package pattern;

import java.util.Scanner;

public class NumberPyramid {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

	        for (int i = 0; i < n; i++) {
	            for (int s = 0; s<(n-i)-1; s++) {
	                System.out.print(" ");
	            }
	           for (int j=0;j<(2*i)+1;j++)      // for (int j = 0; j<(2*i)+1 ; j++) 
	        	   {
	            	
	            	if (j==0||j==(2*i)||i==n-1)
	                System.out.print("*");//i-j
	            	else//j>i
	            		 System.out.print(" ");//j-i
	            }
	            System.out.println();
	        }
	    }
}
