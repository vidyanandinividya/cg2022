package session4.generics;

public class GenericsDemo {

	public static void main(String[] args) {
		//BankAccount<String> b1=new BankAccount<>("hello");
		BankAccount<Integer> b2=new BankAccount<>(10);
		//b1.display();
		b2.display();
		Integer[] m1= {100,200,300};
		Double[] m2= {20.45,67.45,30.00};
		//b1.depositMoney(m1);
		b2.depositMoney(m2);

	}

}
