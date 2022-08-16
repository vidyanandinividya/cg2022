package session2.codingchallenge;

import java.util.Scanner;

public class TaskDao {
	Scanner sc=new Scanner(System.in);
	private Task[] tasks;
	private int index;
	public TaskDao()
	{
		index=0;
		tasks=new Task[5];
	}
	public void addTask()
	{
		System.out.println("Enter the number of task");
		int size=sc.nextInt();
		System.out.println("Enter the task details");
		for(int i=0;i<size;i++)
		{
			Task task=new Task();
			System.out.println("Enter the task title");
			task.setTaskTitle(sc.next());
			System.out.println("Enter the task Text");
			task.setTaskText(sc.next());
			tasks[index++]=task;
		}
		showTask();
		
	}
	public void showTask() {
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null)
			{
				System.out.println(tasks[i]);
			}
		}
		
	}
	public void assignTask()
	{
		showTask();
		System.out.println("Enter the task id to assign");
		int id=sc.nextInt();
		for(int i=0;i<UserDao.users.length;i++)
		{
			if(UserDao.users[i]!=null && UserDao.users[i] instanceof Visitor)
			{
				System.out.println(UserDao.users[i]);
			}
		}
		System.out.println("Enter visitor name to assign the task");
		String name=sc.next();
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null && tasks[i].getTaskId()==id)
			{
				tasks[i].setAssignedTo(name);
			}
		}
	}

}
