package session3.exception;

public class MyResource  implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Close My Resource");
		
	}
	public void doSomething()
	{
		System.out.println("Something My Resource");
	}

}
