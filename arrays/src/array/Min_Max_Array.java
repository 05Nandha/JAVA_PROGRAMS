package array;
import java.util.Scanner;
//import java.util.Arrays;
public class Min_Max_Array {
	

		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the size of Array:");
			int n=in.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
			
//			Arrays.sort(arr); sort method

//			System.out.print(Arrays.toString(arr));//to display array without for loop(toString)method
			int max=arr[0];
		     int min =arr[0];
			for (int i=0;i<n;i++) {
				if (max<=arr[i]) {
					max=arr[i];
					
					if (min>=arr[i]) 
						min=arr[i];	
				}
				
			}
			
			System.out.println("Min " + min);
			System.out.println("Max " + max);
//			int[] arr2=Arrays.copyOf(arr,10);//copyof method
//			System.out.print(Arrays.toString(arr2));
//			
//			System.out.print(Arrays.equals(arr,arr2));//equals method
//			
//
//		}
			in.close();

	}
		
}
