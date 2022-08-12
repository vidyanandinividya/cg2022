package session1.oopsconcepts;

public class Vodafone extends SMSSender {

	@Override
	public void establishConnectionWithYourTower() {
		System.out.println("Connecting using Vodafone Network");
		
	}

	@Override
	public void destroyConnectionWithYourTower() {
		System.out.println("Disconnecting using Vodafone Network");
		
	}

}
