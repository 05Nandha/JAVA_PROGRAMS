package oops;
//used to initialize the values 
//same class name should be declared for the method 
//same class name for the method name is called the constructor
//no return type
//no static or non static
//should exactly match the class name
//create object that automatically calls the constructor 

//if the constructor is not created by us the JVM automatically creates the constructor but there will be no output will be displayed
//one class can have multiple constructors but it should be different like parameterized constructor so we have to insert the any data type into the parameters
// the given number of arguments should be different 

public class Constructor {
	//no argument constructor
	 public Constructor() {
		 
		    System.out.println("No arguments");
	 }
	 //parameterized constructor
	 public Constructor(int a) //
	 {
		 
		    System.out.println("New arguments");
	 }
	 public Constructor(String a) {
		 
		    System.out.println(a);
	 }
	public static void main(String[] args) {
		
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(0);
		Constructor obj2=new Constructor("ABC");
		Constructor obj3=new Constructor("Nandha");
		Constructor obj4=new Constructor();
	}
}