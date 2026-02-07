package loop;

import java.util.Scanner;

public class Nums {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number: ");
	int n=sc.nextInt();
	int even=1, Odd=n;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i%2==0) {
				System.out.println(even++ + "");
			}
			else {
				System.out.println(Odd-- + "");
			}
//				System.out.print(j+1);
//			else {
//				System.out.print(n-j);
			}
		}
		System.out.println();
	}
}
	

