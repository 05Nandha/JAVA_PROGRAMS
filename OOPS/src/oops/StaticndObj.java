package oops;

public class StaticndObj {
	
	// for seperate memory allocation the object is used 
	
     //     static int balance=3000;
	int balance=0;
	public static void main(String[] args) {
		 
		StaticndObj user1= new StaticndObj();
		StaticndObj user2= new StaticndObj();
		StaticndObj user3= new StaticndObj();
		user1.balance=8410;
	   System.out.println(user1.balance);
	   
	   user2.balance=4500;
	   System.out.println(user2.balance);
	   
	   user2.balance=5000;
	   
	   System.out.println(user2.balance);
	   System.out.println(user1.balance);
	   
	   System.out.println(user3.balance);
 	}
}
