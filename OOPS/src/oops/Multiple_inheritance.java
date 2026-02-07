package oops;
class samsung{
	public void  display() {
	}{
		System.out.println("---");
	}
}

interface sony{
	public void Camera();
}
public class Multiple_inheritance extends samsung implements sony{
	public static void main(String[]args) {
		Multiple_inheritance iphone16=new Multiple_inheritance();
		iphone16.display();
		iphone16.Camera();
	}


	@Override
	public void Camera() {
	   System.out.println("---");
	   System.out.println("---");
	   System.out.println("---");
		
	}}
