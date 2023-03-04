package testpackage;

//encapsulation -> Binding code and data together within a single unit
//				-> it is implemented using class, package and access specifiers

//check out testpackage2.Access_Specifier1_Test for main method

public class Access_Specifier1 {
	
	//with private access specifier -> accessed only within the same class
	@SuppressWarnings("unused")
	private void pri_m1() {
		
		System.out.println("Private method of testpackage.Access_Specifier1");
	}
	
	
	//with default (package) access specifier -> accessed only within the same package
	void def_m1() {
			
		System.out.println("Default method of testpackage.Access_Specifier1");

	}
	
		
	//with protected access specifier -> accessed within the same package and 
									   //only by it's subclass outside the package
	protected void pro_m1() {
			
			System.out.println("Protected method of testpackage.Access_Specifier1");
		}
	
	
	//with public access specifier -> accessed from anywhere
	public void pub_m1() {
		
		System.out.println("Public method of testpackage.Access_Specifier1");
	}
	
	
}
