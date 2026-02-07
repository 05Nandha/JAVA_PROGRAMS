package oops;

import demo.Demo;

//public-- can be accessed from within the class within the package and also from outside the packages
//private--cannot be accessed from the other package it should be accessed within the same class only

public class AccessSpecifier {
       static String name="Nandha";  //default access specifier within the class within the package not outside
       
       public static void main(String[] args) {
		System.out.println(AccessSpecifier.name);
		System.out.println(Demo.rollno);
		
		
	}
}
