package oops;

public class ObjExample {
           static int rollno=63;  //static-single memory allocation  //every object has its seperate entity and behaviour like different values.  
	 public static void main(String[] args) {
		
		 
		 ObjExample obj=new ObjExample();
		 System.out.println(obj.rollno);
//		 RandomClass r=new RandomClass();
		 
//		 System.out.println(obj);
		 System.out.println(RandomClass.name);
	}
}
