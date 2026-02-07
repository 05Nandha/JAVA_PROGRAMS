package oops;
import java.util.Scanner;
public class Students {
      
	String name;
	int rollno;
	String dept;
	
	
	Students(String name,int rollno,String dept){
		this.name=name;
		this.rollno=rollno;
		this .dept=dept;
		
	}
	
	void display(){
		System.out.println("Name:"+this.name);
		System.out.println("RollNo:"+this.rollno);
		System.out.println("Dept:"+this.dept);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		//sc.nextLine();
		String name=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter the rollno");
		int rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the dept");
		String dept=sc.nextLine();
		//sc.nextLine();
		Students S=new Students(name,rollno,dept);	
		 
//		Students obj=new Students(name,rollno,dept);
//		obj.display();
		
		S.display();
		sc.close();
	}
}
