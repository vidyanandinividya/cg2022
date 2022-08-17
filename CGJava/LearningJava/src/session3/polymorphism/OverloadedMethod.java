package session3.polymorphism;
public class OverloadedMethod {
	public void test(long lng) 
	{
		System.out.println("Long");
	}
	public void test(Integer int1)
	{
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		OverloadedMethod obj=new OverloadedMethod();
		obj.test(1);

	}

}
