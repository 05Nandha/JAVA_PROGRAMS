package loop;

import java.util.Scanner;

public class Num_greater {
	public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num1=n;
	int num2=0;

	 while(n>0) {
			
	num2=(num2*10)+(n%10);
	n=n/10;
		 
	 }
	 if(num1>num2)
		 System.out.print(num1);
	 else
	 System.out.print(num2);
	}
}

