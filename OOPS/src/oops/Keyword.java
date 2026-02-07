package oops;
//used to hide the data 
//abstarcting or inheriting data from other class  //cannot create the objects 
//only by creating the abstract class inheritng fro other class can be created
//before class the abstract keyword in that particular class we should not keep anything there is no definition in that class that can be written
//confidential files are to be in the abstarct class
//only through inheritance the abstract class can be accessed.
//in interface there should be only abstract method only
abstract class Demo{
	abstract void Display();
	abstract void Intrest(); 
	public void Greet() 
 {
	 
	 System.out.println("Vanakkam");
 }

}
		public class Keyword extends Demo{
			public static void main(String[] args) {
				Keyword obj=new Keyword();
				obj.Display();
			}
			@Override
			void Display() {
				System.out.println("Example for Abstraction");
				
			}
			@Override
			void Intrest() {
				System.out.println("this the example");
				
			}

	
	}

