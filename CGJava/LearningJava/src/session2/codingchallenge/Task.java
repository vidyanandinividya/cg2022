package session2.codingchallenge;

public class Task {
	private int taskId;
	private String taskTitle;
	private String taskText;
	private String assignedTo;
	private static int counttask=1;
	public Task()
	{
		this.taskId=counttask;
		counttask++;
	}
	public int getTaskId() {
		return taskId;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskText() {
		return taskText;
	}
	public void setTaskText(String taskText) {
		this.taskText = taskText;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskText=" + taskText + ", assignedTo="
				+ assignedTo + "]";
	}
	

}
