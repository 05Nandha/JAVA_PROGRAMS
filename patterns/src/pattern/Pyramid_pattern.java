package pattern;

import java.util.Scanner;

public class Pyramid_pattern {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = in.nextInt();

//	        for (int i = 0; i < n; i++) {
//	            for (int s = 0; s<(n-i)+1; s++) {
//	                System.out.print(" ");
//	            }
//	            for (int j = 0; j<i+1 ; j++) {
//	            	if(j==0 || j==i || i==n-1)
//	            		System.out.print("* ");
//	            	else
//	            		System.out.print("  ");              
//	            }
//	            System.out.println();
//	        }
	        
	        
	        
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<n;j++) {
	        		if(i==0 || j==0||j==n-1|| i==n-1)
	        		System.out.print("* ");
	        		else
	            		System.out.print("  "); 
	        	}
	        	System.out.println();
//	        
	        
	        
//	        for(int i=0;i<n;i++) {
//	        	for(int j=0;j<=i;j++) {
//	        		if(j==0 || j==i || i==n-1)
//	        		System.out.print("* ");
//	        		else
//	            		System.out.print("  "); 
//	        	}
//	        	System.out.println();
	        	
	        }
	    }
}



