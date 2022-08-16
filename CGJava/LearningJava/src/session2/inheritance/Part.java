package session2.inheritance;

public class Part {
	
	protected String identifier;
	private String manufacturer;
	private String description;
	public Part(String identifier, String manufacturer, String description) {
		super();
		this.identifier = identifier;
		this.manufacturer = manufacturer;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Part [identifier=" + identifier + ", manufacturer=" + manufacturer + ", description=" + description
				+ "]";
	}
	public void fn1()
	{
		System.out.println("From part class");
	}

	public String getIdentifier() {
		return identifier;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getDescription() {
		return description;
	}

}
