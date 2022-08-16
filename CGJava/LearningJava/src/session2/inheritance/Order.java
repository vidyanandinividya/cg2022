package session2.inheritance;

public class Order  {
	private String product;
	private String count;
	private Customer customer;
	public Order(String product, String count, Customer customer) {
		super();
		this.product = product;
		this.count = count;
		this.customer = customer;
	}
	public String getProduct() {
		return product;
	}
	
	public String getCount() {
		return count;
	}
	public String postalAddress()
	{
		return this.customer.getName()+"\n"+this.customer.getAddress();
	}
	

}
