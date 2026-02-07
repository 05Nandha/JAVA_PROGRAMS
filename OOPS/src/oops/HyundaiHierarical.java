package oops;

public class HyundaiHierarical {

	  String name="Hyundai Venue";
	public	void drive()
		{	
		super.drive();
	//	System.exit(0);
		System.out.println("A compact SUV with modern styling");
	}

public static void main(String[] args) {
	 HyundaiHierarical  obj=new HyundaiHierarical();
	// Hierarchial_Inheritance obj=new AudiHierarical()  late binding.
		System.out.println(obj.name);	
		obj.drive();
}
}
