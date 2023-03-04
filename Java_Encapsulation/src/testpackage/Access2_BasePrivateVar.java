package testpackage;

class Base{
	
//	int def_a;//if variables are non-static (local), value will be 0 within getSum()
//	as local variables can't be accessed outside the scope (here, class Base)
	
	static int def_a; //default variable 
	private static int pri_b; //private variable
	protected static int pro_c; //protected variable
	
	void fill(int a,int b,int c){
		
//		this.def_a = a; //This gives warning as the static field Base.a 
					//should be accessed in a static way (not through 'this' keyword)
		
		Base.def_a = a; 
		Base.pri_b = b;  //as b is private, so to access it getB() is required
		Base.pro_c = c;
	}
	
	static int getB() {
		return pri_b;
	}
}


class Child extends Base{

	int sum;
	
	public int getSum() {
		
		System.out.println("The numbers are : ");
		System.out.println(def_a+" "+getB()+" "+pro_c); 
		//if def_a is non-static, value of def_a will be 0 when assigned by
		//base class object -> base.fill(1, 2, 3); -> sum will be 5 instead of 6
		//but def_a won't be 0 when assigned by -> child.fill(1, 2, 3); - it's not 
		//treated as local in child class
		
		
		sum = def_a+getB()+pro_c; //public method to access the private variable
		
		return sum;
	}
}

public class Access2_BasePrivateVar {

	public static void main(String[] args) {

		Base base = new Base();
		Child child = new Child();
		
		base.fill(1, 2, 3);
//		child.fill(1, 2, 3);
		System.out.println("sum : 1+2+3 = "+child.getSum());

	}

}
