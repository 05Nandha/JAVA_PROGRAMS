package loop;


class ClA{
    int x = 10;
    int y=20;
    void displayA()
    {
        System.out.println("From Class A");
    }
}
 class ClB extends ClA{
    int a = 10;
    int b=20;
    void displayB()
    {
        System.out.println("From Class B");
    }
}
 class ClC extends ClA{
	    int x = 10;
	    int y=20;
	    void displayC()
	    {
	        System.out.println("From Class A");
	    }
	}

 class ClE extends ClB{
	    int a = 10;
	    int b=20;
	    void displayD()
	    {
	        System.out.println("From Class B");
	    }
	}
 
 class ClF extends ClB{
	    int a = 10;
	    int b=20;
	    void displayE()
	    {
	        System.out.println("From Class B");
	    }
	}
 class ClD extends ClC{
	    int a = 10;
	    int b=20;
	    void displayF()
	    {
	        System.out.println("From Class B");
	    }
	}

	

public class Inheritance
{
	public static void main(String[] args) {
		ClA a = new ClA();//Class A 
		ClB b = new ClB();//Class B
		b.displayB();
	}
}
