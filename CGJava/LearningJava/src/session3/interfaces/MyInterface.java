package session3.interfaces;

public interface MyInterface {
	void existingMethod(String str);
	default void newMethod()
	{
		System.out.println("Newly added default method");
	}
	public static void anotherNewmethod()
	{
		System.out.println("Newly added static method");
	}

}
