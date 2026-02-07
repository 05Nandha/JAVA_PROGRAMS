package loop;
import java.util.Scanner;

public class Methods
{
    void display(int x,int y){
        System.out.println("Addition"+(x+y));
    }
//    void display1(int y){
//        System.out.println("The value is:"+y);
//    }

	public static void main(String[] args) {
	  
	    Scanner in=new Scanner(System.in);
	    int size=in.nextInt();
	 
	    int a=in.nextInt();
	    int b=in.nextInt();
		Methods m=new Methods();
		m.display(a,b);
		
	}
}
