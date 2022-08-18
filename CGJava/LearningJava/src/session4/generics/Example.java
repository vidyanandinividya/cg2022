package session4.generics;

import java.util.ArrayList;
import java.util.List;

public class Example {

	//Uper Bound
	public static void deleteBike(List<? extends Bike> l1, Bike b1)
	{
		
		l1.remove(b1);
		System.out.println("Bike removed");
	}
	//Lower Bound
	public static void addBike(List<? super Bullet> l2)
	{
		l2.add(new Bullet("classic"));
		System.out.println("Bike Added");
	}
	//Wild card
	public static void printItems(List<?> list)
	{
		for(Object i:list)
		{
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		List<Vehicle> v1=new ArrayList<>();
		List<Bullet> b1=new ArrayList<>();
		List<Bike> b2=new ArrayList<>();
		List<Car> c1=new ArrayList<>();
		addBike(b1);
		addBike(v1);
		addBike(b2);
		//addBike(c1);
		printItems(v1);
		printItems(b1);
		Bullet bullet1=b1.get(0);
		Bike bike1=b2.get(0);
		Vehicle v=v1.get(0);
		deleteBike(b1,bullet1);
		deleteBike(b2, bike1);
		//deleteBike(v1, v);
		printItems(b1);
	}

}
