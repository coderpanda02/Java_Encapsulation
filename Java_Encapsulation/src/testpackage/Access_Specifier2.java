package testpackage;

class A1{
	
//	public void m1() {
//	private void m1() {	
	protected void m1() {
		
		System.out.println("m1 method of A1 class");
	}
}


class B1 extends A1{
	
//	void m1(){ //can't use default as visibility of inherited method can't be reduced
	
//	private void m1(){ //can't reduce the visibility of an inherited method as
	//the overriding method (in Child class) should be less restrictive than
	//the overridden method (in Base class)
	
	
//	public void m1() { //it's also possible as the base class method's
						//visibility is protected
	protected void m1() { 

		System.out.println("m1 method of B1 class");
	}
}


public class Access_Specifier2 {	

	public static void main(String[] args) {	
		
		A1 a = new A1(); //private will give error-> method of A1 class is not visible
		a.m1(); //calls the method of A1 class
		
		a = new B1(); 
		a.m1(); //calls the method of B1 class

	}

}
