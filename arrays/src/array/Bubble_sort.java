package array;
import java.util.Arrays;
import java.util.Scanner;
public class Bubble_sort {

	public static void main(String[] args) {
		
	}
////		Scanner in=new Scanner(System.in);
//		System.out.print("Enter the size of Array:");
//		int n=in.nextInt();
//		int[] arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i]=in.nextInt();
////		}
	//	Arrays.sort(arr);// sort method
//
//		System.out.print(Arrays.toString(arr));
		
		
		static void sort (int []arr) {
			int i = 0;
		for(int a=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		
	
		}
}