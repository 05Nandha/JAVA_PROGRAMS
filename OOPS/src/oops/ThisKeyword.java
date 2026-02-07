package oops;
// used for the purpose of calling current class method ,its variables. refers current class object.
//used to call the external constructors
// used in the first line of the constructor 
// one constructor is called by us and the others are called using the this keyword given in the first constructor.
//instead of calling the each and every object 
 public class ThisKeyword {
	int rollno=63;
	double demo() {
		return 35.09;
	}
	
	ThisKeyword(){
		this(34);
		System.out.println(this.demo());
		System.out.println(this.rollno);
		System.out.println("Default constructor");
	}
	
	ThisKeyword(int empid){
		
		System.out.println("My employee id:"+empid);
	}
	
	ThisKeyword finalcall() {
		return this;
	}//it return the object of the class,the class name here is given as the data type
	public static void main(String[] args) {
		ThisKeyword obj= new ThisKeyword();
		//ThisKeyword obj2= new ThisKeyword(45);
        System.out.println(obj);//memory address
        System.out.println(obj.finalcall()); //it also returns the memory address
		
	}
}
 
 

