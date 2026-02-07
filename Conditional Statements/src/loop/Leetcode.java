package loop;

import java.util.Scanner;

public class Leetcode {


		public static void main(String[] args){
			Scanner in=new Scanner(System.in);		
			
				System.out.println("Enter the size of the array: ");
				int size=in.nextInt();
				int[] arr=new int[size];
				//int a=45;
			//	int arr[]= {10,20,30,45};
				int sum=0;
				for (int i=0;i<size;i++) {
					arr[i]=in.nextInt();
					sum=sum+arr[i];
				}
					
				
						System.out.println(sum);
					}
				
			
		}

