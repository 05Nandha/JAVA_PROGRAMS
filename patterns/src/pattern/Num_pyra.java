package pattern;

import java.util.Scanner;

public class Num_pyra {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

	        for (int i = 0; i < n; i++) {
	        	int temp=i;
	            for (int s = 0; s<(n-i)-1; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j<(i*2)+1 ; j++) {
	            	 System.out.print(Math.abs(temp--) +"");
//	            	if(j>=i)
//	                System.out.print(temp++ +"");
//	            	else {
//	            		 System.out.print(temp-- +"");
//	            	}
	            }
	            System.out.println();
	        }
	    }
}