package array;

import java.util.Scanner;


public class Duplicates
{
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
        
		int arr1[] = {10,5,1,5,5,10};
		int[] arr2 = new int[arr1.length];
		
	
	    for(int i=0;i<arr1.length;i++)
	    {
	        for(int j=i+1;j<arr1.length;j++)
	        {
	            if(arr1[i]==arr1[j])
	            {
	                arr2[j]=1;
	            }
	        }
	    }
	    
	    for(int i=0;i<arr1.length;i++)
	    {
	        if(arr2[i]==1)
	        {
	            System.out.println(arr1[i]);
	        }
	    }
	
	
	
	
	
	
	
// 		for(int i=0;i<arr2.length;i++)
// 		{
// 		    System.out.println(arr2[i]);
// 		}
		
		
		
		
	}
}

