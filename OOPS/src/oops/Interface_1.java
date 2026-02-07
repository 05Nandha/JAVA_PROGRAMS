package oops;

public class Interface_1 implements Interface {

	@Override
	public void poster() {
		System.out.println("Created by UI Team");
	}

	@Override
	public void Duration() {
		System.out.println("Created at 2022");
		
	}
	public static void main(String[] args) {
		Interface_1 obj=new Interface_1();
				obj.Duration();
		obj.poster();
	}
	
}

