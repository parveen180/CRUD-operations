package credentials;

public class User {
	private String userName;
	private String password;
	private  Boolean active;
	
	 public User() {
		 
	 }
	 
	public User(String userName,String password,Boolean active) {
		this.userName=userName;
		this.password=password;
		this.active=active;
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
