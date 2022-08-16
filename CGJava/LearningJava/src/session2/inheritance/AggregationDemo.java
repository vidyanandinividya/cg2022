package session2.inheritance;

import java.util.ArrayList;
import java.util.List;

//country class
class Country
{
	List<Sportsperson> sportspersons; //Assoication (Aggregation)
	private String countryName;

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public List<String> getSportspersons() {
		List<Sportsperson> listofSportspersons=this.sportspersons;
		List<String > names=new ArrayList<>();
		for(Sportsperson sportsperson:listofSportspersons)
		{
			names.add(sportsperson.getName());
		}
		return names;
	}

	public void setSportspersons(List<Sportsperson> sportspersons) {
		this.sportspersons = sportspersons;
	}
	
	
}
//Sportsperson class
class Sportsperson
{
	private String name;

	public Sportsperson(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
public class AggregationDemo {

	public static void main(String[] args) {
		//create three sportsperson object
		Sportsperson dhoni=new Sportsperson("Dhoni");
		Sportsperson kohli=new Sportsperson("Kohli");
		Sportsperson Rohit=new Sportsperson("Rohit");
		//create a country
		Country india=new Country("India");
		//create a arraylist and add the sportsperson
		List<Sportsperson> listSportspersons=new ArrayList<>();
		listSportspersons.add(dhoni);
		listSportspersons.add(kohli);
		listSportspersons.add(Rohit);
		//add this list to the country class
		india.setSportspersons(listSportspersons);
		System.out.println("The sports people from country "+india.getCountryName()+" are "
		+india.getSportspersons());
	}

}
