package oops;
// using extends acquiring all the properties from the other class using extends
class Sample{
	int rollno=63;
	public void display() {
		System.out.println("Single inheritance");
	}
	
	//polymorphism
	//compile time polymorphism(method overloading)//same name two methods based on parameter they are differentiates
	//run time(method overriding ).//one method in the parent and the other is in the child class base class-->parent class  with extends its called child class. 
	
	void Exit() {
		System.out.println("Exit through gate");
	}
	void Exit(int a) {
		System.out.println("Exit through lift");
	}
	void Exit(String name) {
		System.out.println("Exit through Main gate");
	}
	
	public void display1() {
		super.display1();
		System.out.println("Single inheritance from parents");
	}
}
public class Inheritance extends Sample {
	public static void main(String[] args) {
//		Inheritance obj1=new Inheritance();
//		obj1.display();
//		System.out.println(obj1.rollno);
		
		Inheritance obj=new Inheritance();
		obj.Exit();
		obj.Exit(63);
		obj.Exit("Nan");
		obj.display();
}
}
	