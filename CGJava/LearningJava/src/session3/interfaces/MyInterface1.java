package session3.interfaces;

public interface MyInterface1 {
	void disp(String str);
	default void newMethod()
	{
		System.out.println("Newly added default method");
	}
}
