package ops;

public class Ternary_operator {

	
	
		public static void main(String[] args) {
		    int x=5,y=8,z=3,a=10;
                 int num=(x > y)
                         ? ((x > z) ? ((x > a) ? x : a) : ((z > a) ? z : a))
                                 : ((y > z) ? ((y > a) ? y : a) : ((z > a) ? z : a));
	    	   
	    	   
	    	   System.out.println(num);
	    	   
		}
	}

