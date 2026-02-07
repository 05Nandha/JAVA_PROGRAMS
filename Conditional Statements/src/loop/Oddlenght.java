package loop;

import java.util.Scanner;

public class Oddlenght {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int num1=n;
		int num=n;
		int count=0,i=0, num2=0;
		
		
		int temp=n;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
	int firsthalf=count/2;
	
	while(i<firsthalf) {
		num1=num1/10;
		i++;
	}
	
	int middle=0;
	if(count%2!=0) {
		middle=num1%10;
		num1=num1/10;
	}
	
	i=0;
	int secondhalf=num;while(i<n) {
		num2=num2*10+(secondhalf%10);
		secondhalf=secondhalf/10;
	}
	int result;
	if(count%2==0) {
		result=(num1*num2);}
		else {
			result=(num1*10+middle)*num2;
		}
	System.out.println(result);
	}
	}

