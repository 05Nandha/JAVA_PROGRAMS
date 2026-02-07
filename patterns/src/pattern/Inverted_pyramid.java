package pattern;
import java.util.Scanner;
public class Inverted_pyramid {

	   public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter n: ");
		        int n = in.nextInt();

		        for (int i = 1; i <= n; i++) {
		            for (int s = 1; s<i; s++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j<=(2*(n-i))+1 ; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		    
}
