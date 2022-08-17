package session3.polymorphism;

class Parent
{
	public void doSomething()
	{
		System.out.println("Doing something in Parent class");
	}
	public void fn1()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	@Override
	public void doSomething()
	{
		System.out.println("Doing something in Child class");
	}
	public void fn2()
	{
		System.out.println("Child class");
	}
}
public class OverridingMethod {
	public static void main(String []args)
	{
		Parent p=new Parent();
		p.doSomething();
		Parent p1=new Child();
		p1.fn1();
		//p1.fn2();
		//p1 is known as polymorphic variable
		//the polymorphic variable can call all the methods of the 
		//parent class except overriden method
		//it can call only the overriden method from the child class
		p1.doSomething();//Dynamic Polymorphism
	}

}
