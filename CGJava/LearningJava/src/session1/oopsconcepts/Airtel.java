package session1.oopsconcepts;

public class Airtel extends SMSSender {

	@Override
	public void establishConnectionWithYourTower() {
		System.out.println("Connecting using Airtel Network");
	}

	@Override
	public void destroyConnectionWithYourTower() {
		System.out.println("Disconnecting using Airtel Network");
	}

}
