package loop;

import java.util.Scanner;

public class MethObj
{
    //method
    //mentod definition
    void display(int x,int y)
    {
        System.out.println("Addition : "+(x+y));
    }
    void display1()
    {
        System.out.println("World");
    }
    //Main method
	public static void main(String[] args) {
	    
	    Scanner in  = new Scanner(System.in);
	    int size = in.nextInt();//3
	    MethObj m = new MethObj();
	    for(int i=0;i<size;i++)//1
	    {
	        int a=in.nextInt();//10
	        int b=in.nextInt();//20
	        m.display(a,b);// 10 20
	    }
	    
	    
	    //method call
		}
}