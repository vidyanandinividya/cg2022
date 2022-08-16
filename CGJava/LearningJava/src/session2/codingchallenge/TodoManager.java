package session2.codingchallenge;

import java.util.Scanner;

public class TodoManager {
	private static User curretnUser;
	private static UserDao userDao=new UserDao();
	private static TaskDao taskDao=new TaskDao();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opt=0;
		do
		{
			if(curretnUser==null)
			{
				System.out.println("1.Register User (Client/Visitor)");
				System.out.println("2.Login");
				System.out.println("Enter your choice");
				opt=sc.nextInt();
				switch(opt)
				{
				case 1:
						userDao.register();
						break;
				case 2:
						curretnUser=userDao.loginUser();
						break;
				default:
						System.out.println("Invalid choice");
				}
			}
			else
			{
				System.out.println("Task Menu");
				if(curretnUser instanceof Visitor)
				{
					System.out.println("1.Show my task");
					System.out.println("2.Log out");
					System.out.println("Enter your choice");
					opt=sc.nextInt();
					switch(opt)
					{
					case 1:
							taskDao.showTask();
							break;
					case 2:
							curretnUser=null;
							break;
					default: 
							System.out.println("Invalid Choice");
					}
				}
				else
				{
					System.out.println("1.Add Task");
					System.out.println("2.Search Task");
					System.out.println("3.Update Task");
					System.out.println("4.Delete Task");
					System.out.println("5.Assign Task");
					System.out.println("6.Log out");
					System.out.println("Enter your choice");
					opt=sc.nextInt();
					switch(opt)
					{
					case 1:
							taskDao.addTask();
							break;
					case 2:
							
							break;
					case 3:
							break;
					case 4:
							break;
					case 5:
							taskDao.assignTask();
							break;
					case 6:
							curretnUser=null;
							break;
					default: 
							System.out.println("Invalid Choice");
					}
				}
			}
			
		}while(opt!=0);
		

	}

}
