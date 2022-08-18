package session4.generics;

public class BankAccount<T extends Number> {
	T t1;
	public BankAccount(T t1) {
		this.t1=t1;
	}
	public void display()
	{
		System.out.println(t1);
	}
	public <T> void depositMoney(T[] money)
	{
		for(T i:money)
		{
			System.out.println(i);
		}
	}

}
