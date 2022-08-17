package session3.interfaces;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {
	private List<FlightService> listVendors=null;
	public FlightManager()
	{
		listVendors=new ArrayList<>();
	}
	public void addVendor(FlightService fs)
	{
		this.listVendors.add(fs);
	}
	public List<FlightService> getLisstVendors()
	{
		return listVendors;
	}

}
