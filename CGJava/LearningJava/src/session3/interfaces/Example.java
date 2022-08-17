package session3.interfaces;

public class Example implements MyInterface,MyInterface1{
	@Override
	public void existingMethod(String str) {
		System.out.println("My Interface str : "+str);
		
	}
	@Override
	public void disp(String str) {
		System.out.println("My interface1: "+str);
		
	}
	@Override
	public void newMethod() {
		System.out.println("Implemetation of default method");
	}
	
	public static void main(String[] args) {
		MyInterface obj=new Example();
		obj.existingMethod("Hello");
		obj.newMethod();
		MyInterface.anotherNewmethod();
		MyInterface1 obj1=new Example();
		obj1.disp("World");

	}
	

	

}
