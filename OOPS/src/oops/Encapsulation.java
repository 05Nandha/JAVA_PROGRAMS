package oops;
//mixed data with bundle of data to store eg:class
//this can be achieved by private access specifier  
//using getter and setter method we can access to the other class for the private encapsulation
// private directly cannot be accessed but it can be accessed through the public that are in the same class using 'this' 
public class Encapsulation {
	
	private int accno;
	private String name;
	private float balance;
	
	public  void setaccno(int accno) {
		this.accno=accno;
		}
	
	public  void setname(String name) {
		this.name=name;
		}
	public  void setbalance(float balance) {
		this.balance=balance;
		}
	public float getbalance() {
		return balance;
		
	}

	public int getaccno() {
		return accno;
	}
	public String getname() {
		return name;
	}




	
}
