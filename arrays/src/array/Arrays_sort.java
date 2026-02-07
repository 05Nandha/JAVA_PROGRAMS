package array;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_sort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);// sort method

		System.out.print(Arrays.toString(arr));//to display array without for loop(toString)method
		
		int[] arr2=Arrays.copyOf(arr,10);//copyof method
		System.out.print(Arrays.toString(arr2));
		
		System.out.print(Arrays.equals(arr,arr2));//equals method
		

	}

}