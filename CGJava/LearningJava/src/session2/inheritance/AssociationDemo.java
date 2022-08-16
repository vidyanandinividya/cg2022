package session2.inheritance;

public class AssociationDemo {

	public static void main(String[] args) {
		Customer c=new Customer("John", "Bengaluru");
		Order order=
				new Order("Mobile","10",new Customer("jack","Delhi"));
		System.out.println(order.postalAddress());

	}

}
