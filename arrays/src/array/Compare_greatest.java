package array;

public class Compare_greatest {

	public static void main(String[] args) {
		int arr[]= {1,4,5,63,7};
		int count=0;
		
		
		for(int i=0;i<arr.length;i++) {
                 
			for(int j=0;j<arr.length;j++) {
				
				
				if(i!=j) {
					if(arr[j]>arr[i]) {
						count++;
					}
					System.out.print(arr[i]+","+arr[j]+"  ");
				}
			}
			
			System.out.println("Count =" + count);
			count=0;
	}

}
}
