package model.objects;

public class User extends Person {
	private String username;
	private String password;
	private String nickname;
	private int filedComplaints;
	private int userType;
	
	//Static variables for user
	public static final int ADMIN = 0;
	public static final int USER = 1;
	
	public User(long id,String username,String password,int userType) {
		super(id);
		this.username = username;
		this.password = password;		
		this.userType = userType;
		this.filedComplaints = 0;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	public int getFiledComplaints() {
		return filedComplaints;
	}
	
	public void newFiledComplaint() {
		filedComplaints++;
	}
	
}
