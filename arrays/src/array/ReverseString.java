package array;

public class ReverseString {
	public static void main(String[] args) {
    	String str = "This is a note";
    	String[] arr = str.split(" ");
    	
    	for(int i=arr.length-1;i>0;i--) {
    		System.out.println(arr[i]);
    	}
}
}