package session3.interfaces;

public class Emirates implements FlightService,PaymentService {

	@Override
	public void getAllFlights() {
		System.out.println("Get Flights in Emirates way");
		
	}

	@Override
	public void doBooking() {
		System.out.println("Do booking in Emirates way");
		
	}

	@Override
	public void payment() {
		System.out.println("Payment service");
		
	}

}
