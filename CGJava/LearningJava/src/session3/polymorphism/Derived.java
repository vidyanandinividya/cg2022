package session3.polymorphism;

class A1{}
class A2 extends A1{}
class A3 extends A1{}
class A4{}
class Base
{
	protected Object connect(String s1)
	{
		System.out.println("Doing connection in Parent way");
		return null;
	}
	protected Number connect1(A1 a1)
	{
		System.out.println("Doing connection in A1 ways ");
		return null;
	}
}
public class Derived  extends Base{
	@Override
	public Float connect(String s2)
	{
		System.out.println("Doing connection in child way");
		return null;
	}
	@Override
	public Integer connect1(A1 a2)
	{
		System.out.println("Doing connection in A2 ways ");
		return null;
	}
	
	public static void main(String[] args) {
		Base b=new Derived();
		b.connect("Hello");
		b.connect1(new A3());
		

	}

}
