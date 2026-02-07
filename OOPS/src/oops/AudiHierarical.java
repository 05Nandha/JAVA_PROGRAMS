package oops;


public class AudiHierarical extends Hierarchial_Inheritance {
	
		  String name="Audi Q5";
		public	void drive()
			{	
			super.drive();
		//	System.exit(0);
			System.out.println("Combines comfort and performance with quattro AWD and a plush cabin.");
		}
	  
	 public static void main(String[] args) {
		 AudiHierarical  obj=new AudiHierarical ();
		// Hierarchial_Inheritance obj=new AudiHierarical()  late binding.
			System.out.println(obj.name);	
			obj.drive();
	}
}
