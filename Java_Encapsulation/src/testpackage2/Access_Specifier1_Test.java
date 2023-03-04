package testpackage2;

import testpackage.Access_Specifier1;

class Access_Specifier1_Child extends Access_Specifier1{
	 
	@SuppressWarnings("unused")
	private void pri_m1() { //overriding can't be possible as private is not visible
			
		System.out.println("\nInside child class private method pri_m1");
//		super.pri_m1(); //error - not visible
	}
	
	
	void def_m1() { //overriding not possible as it is private to a different package
			
		System.out.println("\nInside child class default method def_m1");
//		super.def_m1(); //error - not visible
	}
	
	
	//overriding the protected method pro_m1() 
	protected void pro_m1() {
			
		System.out.println("\nInside child class protected method pro_m1");
		super.pro_m1();
			
	}
		
	
	//overriding the public method pub_m1() 
	public void pub_m1() {
		
		System.out.println("\nInside child class public method pub_m1");
		super.pub_m1();	
	}
}


public class Access_Specifier1_Test {

	public static void main(String[] args) {
		
		System.out.println("Inside the main method of "
							+ "testpackage2.Access_Specifier1_Test");
		System.out.println("\nCalling methods of testpackage1.Access_Specifier1 ->");
		
		Access_Specifier1 ac = new Access_Specifier1(); //have to import 
		//testpackage.Access_Specifier1, otherwise gives error
		
		//Another way - without import package testpackage.Access_Specifier1 -->
//		testpackage.Access_Specifier1 ac = new testpackage.Access_Specifier1();
		
		ac.pub_m1(); //only pub_m1() is visible by a non-sub class outside the package
//		ac.pro_m1(); //gives error, method is not visible
//		ac.def_m1(); //gives error, method is not visible
//		ac.pri_m1(); //gives error, method is not visible
		
		
		System.out.println("\nCalling methods of "
							+ "testpackage2.Access_Specifier1_Child ->");

		//Accessing protected method of Access_Specifier1 outside the package
		//through it's child class Access_Specifier1_Child
		Access_Specifier1_Child child = new Access_Specifier1_Child();
		
//		child.pri_m1();//gives error, as not accessible in class Access_Specifier1_Test
		child.def_m1();
		child.pro_m1();
		child.pub_m1();
	}

}
