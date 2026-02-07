package loop;

import java.util.Scanner;

public class SumOfOddEven {

     public static void main(String[] args) {

          Scanner in=new Scanner(System.in);
          System.out.print("enter the number:");
          int num=in.nextInt();
          int even=0,odd=0;

            System.out.println("The output of Odd:");

              for(int i=1;i<=num;i=i+2) {
	             odd=odd+i;
           }
              System.out.println(odd);

                 System.out.print("The output of Even: ");

                 for(int i=2;i<=num;i=i+2) {

                    even=even+i;
            }
                 System.out.println(even);

          

     }
}
