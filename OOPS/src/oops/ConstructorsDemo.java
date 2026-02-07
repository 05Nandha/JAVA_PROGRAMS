package oops;
//used to initialize the values 
//same class name should be declared for the method 
//same class name for the method name is called the constuctor
//no return type
//no static or non static
//should exactly match the class name
//create object that automatically calls the constructor 
public class ConstructorsDemo {
	//static void function() //no return need to be given
	
	 static int function() {
		 
		 int a=2;
		 int c=a+5;
		 
		 return c;       //any datatype that are mentioned in the method can be given for example if its int you can return it as return 93; or if its string you can write it as return "ABC"
	 }
	public static void main(String[] args) {
		int ab=6;
		int result= function()+ab;
		
		System.out.println(result);
	}
}
