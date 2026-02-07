package loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
   
	int sum=0;
	for (int i=1;i<=n;i++)  //(int i=2;i<=n+1;i++) input=5;output=872
	{
	    int fact = 1;
	for(int j=1;j<=i;j++) {
		fact*=j;
	
	}
	sum+=fact;
	}
	System.out.println(sum);
	
	
	
	//FActorial
//	int fact=1;
//	for(int i=1;i<=n;i++) {
//		fact=fact*i;
//	}
//	System.out.println("Factorial="+fact);
	}
}










