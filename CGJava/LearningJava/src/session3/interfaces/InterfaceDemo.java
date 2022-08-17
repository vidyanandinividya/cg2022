package session3.interfaces;

public class InterfaceDemo {
	private static FlightManager flightManager=new FlightManager();

	public static void main(String[] args) {
		loadVendors();
		System.out.println("Get All Flights");
		for(FlightService fs:flightManager.getLisstVendors())
		{
			fs.getAllFlights();
		}
		System.out.println("Do booking");
		for(FlightService fs:flightManager.getLisstVendors())
		{
			fs.doBooking();
		}

	}
	public static void loadVendors()
	{
		flightManager.addVendor(new Emirates());
		flightManager.addVendor(new AirIndia());
	}

}
