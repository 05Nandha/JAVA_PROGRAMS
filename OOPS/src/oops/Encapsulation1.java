package oops;

public class Encapsulation1 {
	
	public static void main(String[] args) {
		Encapsulation manager =new Encapsulation();
		
		manager.setaccno(200);
		manager.setname("Nandha");
		manager.setbalance(10000);
		
		
		
		System.out.println(manager.getaccno());
		System.out.println(manager.getname());
		System.out.println(manager.getbalance());
	}
}
