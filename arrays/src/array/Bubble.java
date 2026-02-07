package array;
import java.util.Arrays;
public class Bubble {
	static void sort (int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
}
}
	public static void main(String[] args) {
		
		int arr[]= {2,4,9,1,0,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
}}
