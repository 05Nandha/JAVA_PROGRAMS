package pattern;

import java.util.Scanner;

public class Diamond_pattern {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

	        for (int i = 0; i < n; i++) {
	            for (int s = 0; s<(n-i)-1; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j<(i*2)+1 ; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	         for (int i = 0; i>=1; i--) {
	            for (int s = 0; s<(n-i)-1; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j<(i*2)+1 ; j++) {
	                System.out.print(j);
	            }
	        
	        for (int j = 1; j<=(2*(n-i))+1 ; j++) {
                System.out.print("* ");
            }
	 
	         }
	    }
}