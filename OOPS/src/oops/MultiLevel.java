package oops;

public class MultiLevel{
	
	static class fruits{
		String mynam="Im Apple";
		void fun()
		{	
		System.out.println("This is superclass");
	}
	}
static	class Apple extends fruits{ //base class,parent  //for mango the apple is the parent class so it is said to be the intermediate class
		String fullname="Im Apple";
		void fun()
		{	
			super.fun();
		System.out.println("This is Sub Class One");
	}
	static class Mango extends Apple{//sub class,child class 
		String myname="Im Apple";
		void fun() {
			super.fun();
			System.out.println("This is Sub Class Two");
		}
		
		public static void main(String[] args) {
			Mango obj=new Mango();
			System.out.println(obj.myname);	
			obj.fun();
			System.out.println(obj.fullname);
		

	}
	}
}

}