package session2.inheritance;

public class Engine extends Part {
	private String engineType;

	public String getEngineType() {
		return engineType;
	}

	public Engine(String engineType,String identifier, String manufacturer, String description) {
		//super() is used to call the constructor of the super class
		super(identifier, manufacturer, description);
		this.engineType=engineType;
	}

	@Override
	public String toString() {
		//super keyword is used to call the super class method
		return super.toString()+"Engine [engineType=" + engineType + "]";
	}
	
	public void fn2()
	{
		super.fn1();
		System.out.println("from Engine class");
		
	}
	
}
