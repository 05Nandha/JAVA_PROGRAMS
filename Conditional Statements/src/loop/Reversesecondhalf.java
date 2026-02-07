package loop;

import java.util.Scanner;

public class Reversesecondhalf {
public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int num1=n;
		int num2=0;
		int count=0;
		
		while(n>0) {
			n=10;
			count++;
		}
		
		int j=0;
		while(j<(count/2))
		{
			num2=(num2*10)+(num1%10);
			num1/=10;
			j++;
		}
		
		for(int k=0;k<count/2;k++)
		{
			num1*=10;
		}
		System.out.println(num1+num2);
		
}

}