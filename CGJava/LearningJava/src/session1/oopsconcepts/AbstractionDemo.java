package session1.oopsconcepts;

public class AbstractionDemo {

	public static void main(String[] args) {
		SMSSender airtel=new Airtel();
		SMSSender vodafone=new Vodafone();
		airtel.sendSMS();
		System.out.println("======================");
		vodafone.sendSMS();

	}

}
