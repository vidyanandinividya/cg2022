package session2.codingchallenge;

public class User {
	private int userId;
	private String username;
	private String password;
	private String emailId;
	private static int countuser=1;
	public User()
	{
		this.userId=countuser;
		countuser++;
	}
	public int getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", emailId=" + emailId
				+ "]";
	}
	
	
}
