package loop;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);		
		
			System.out.println("Enter the size of the array: ");
			int size=in.nextInt();
			int[] arr=new int[size];
			//int a=45;
		//	int arr[]= {10,20,30,45};
			
			for (int i=0;i<size;i++) {
				System.out.println("Enter the input");
				arr[i]=in.nextInt();
					
//				if (arr[i]%2==0) {
//					System.out.println("Even");
//				
//				}
//				else {
//					System.out.println("odd");
				//}
//				if(arr[i]==a) {
//					System.out.println(i);
				}
				
				for ( int i=0;i<size;i++) {
					System.out.println(arr[i]);
				}
			}
		
	}

