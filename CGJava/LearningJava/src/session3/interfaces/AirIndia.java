package session3.interfaces;

public class AirIndia implements FlightService{

	@Override
	public void getAllFlights() {
		System.out.println("Get Flights in Air India way");
		
	}

	@Override
	public void doBooking() {
		System.out.println("Do booking in Air India way");
		
	}


}
