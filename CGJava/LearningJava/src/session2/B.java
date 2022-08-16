package session2;

import session1.A;

public class B extends A {
	public static void main(String []args)
	{
		
		B obj=new B();
		obj.fn1();
		//obj.fn2();
		obj.fn3();
		A obj1=new A();
		obj1.fn1();
		//obj1.fn2(); //not accessible (private)
		//obj1.fn3(); //not accessible (not in same package)
		
		
	}

}
