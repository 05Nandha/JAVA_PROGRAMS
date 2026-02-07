package loop;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("Enter the number:");
			
					for(int i=1;i<=10;i++) {
					int num=i*n;
					System.out.println(num);
					}
	}

}
