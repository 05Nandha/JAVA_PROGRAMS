package loop;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("THe num is:");
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 sum=sum+i;
		 }
				System.out.println(sum);

	}

}
