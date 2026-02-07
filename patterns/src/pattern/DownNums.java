package pattern;
import java.util.Scanner;
public class DownNums {
	
		
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter n: ");
		        int n = in.nextInt();

		        for (int i = 0; i <n; i++) {
		            for (int s = 0; s<=i; s++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j<n-i ; j++) {
		                System.out.print(j);
		            }
		            System.out.println();
		        }
		    }
	}
