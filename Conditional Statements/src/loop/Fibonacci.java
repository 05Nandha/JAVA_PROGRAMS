package loop;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a;
	 System.out.println("enter a number: ");
	int n=sc.nextInt();
   
    int fib=0, b=1;
    System.out.println(fib);
    System.out.println(b);
	for (int i=1;i<n-1;i++) {
       int c= fib+b;
		//fib=fib+1;
 System.out.println(" " +c);
       fib=b;
       b=c;
	}

	
	}

}