package session2.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Engine engine=
				new Engine("Hybrid", "hz", "volkswagen","vw 1L 86-91");
		System.out.println(engine.getEngineType());
		System.out.println(engine.getManufacturer());
		System.out.println(engine);
		//engine.fn2();
		
	}

}
