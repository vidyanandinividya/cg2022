package session1;

public class Main {

	public static void main(String[] args) {
		/*
		 * person object having the value name=john and age=31
		 */
		//Person person=new Person("John",31);
		
		/*
		 * harry object having the value name=Harry and age=30
		 */
		//Person harry=new Person("Harry",30);
		//person.printPerson();
		//harry.printPerson();
		/*
		 * harry object having the value name=harry and age=31
		 */
		//harry.growOlder();
		//harry.printPerson();
		/*System.out.println(harry); //harry.toString()
		System.out.println(harry.getAge()); // 31
		System.out.println(harry.getName()); //Harry
		harry.setName("Harry Porter");
		harry.setAge(34);
		System.out.println(harry);//harry.toString() 
		System.out.println(person);//person.toString()*/
		Person john=new Person("John",15);
		if(john.allowedToVote(john))
		{
			System.out.println(john.getName()+" allowed to vote");
		}
		else
		{
			System.out.println(john.getName()+" not allowed to vote");
		}
		System.out.println(john);

	}

}
