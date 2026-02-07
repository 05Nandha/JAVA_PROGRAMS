package pattern;

import java.util.Scanner;

public class Star_pattern {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number: ");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<i+1;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	}
