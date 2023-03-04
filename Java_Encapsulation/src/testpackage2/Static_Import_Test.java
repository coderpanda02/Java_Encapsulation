package testpackage2;

//static methods of a class need to be imported with 'import static' keywords

import static testpackage.Static_Import.display2; //importing static method
//import static testpackage.Static_Import.display1;
import testpackage.Static_Import; //importing non-static method


public class Static_Import_Test {

	public static void main(String[] args) {

		Static_Import s = new Static_Import();
		
		s.display();  //calling the non-static method
		
//		s.display1(); //not recommended, As display1() is static,
					//it should be accessed in static way -> ClassName.method()
		
		Static_Import.display1(); //not required if static import is done in the import
					//section by -> import static testpackage.Static_Import.display1()
		
		display2(); //As static import is done above, so no need to call by class name
		
	}

}
