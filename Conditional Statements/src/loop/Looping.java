package loop;
import java.util.Scanner;
public class Looping {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the value of a:");
		 int a=sc.nextInt();
		 while(true) {
			 System.out.println("Enter you choice");
			 int n=sc.nextInt();
			 System.out.println("Enter the valye of b:");
			 int b=sc.nextInt();
			 switch(n)
			 {
			 case 1:{
				 a+=b;
						System.out.println("Addition:"+a);
						break;
			 }
			 }
			 
		 }
		 
	}

}
