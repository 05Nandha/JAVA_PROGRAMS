package pattern;


public class Numpattern
{
	public static void main(String[] args) {
	    int n=3;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
	      if(i+j+1>n) {
	    	  System.out.print(i+j+1-n);
	      }
	      else {
	    	  System.out.print(i+j+1);
	      }
	      
		    	
		    	
		    	
		    	
//		    	System.out.print("("+i+","+j+")");
//		        System.out.print((i+j)+ 1);

		    }
		    System.out.println();
		}
	}
}
