package gamer;

import java.util.Date;

public class User {
	private int id;
	private String nickName;
	private String firstName;
	private String lastName;
	private String userId;
	private String email;
	private String password;
	private Date dateOfBirth;
	
	public User() {}
	
	public User(int id, String nickName, String firstName, String lastName, String userId, String email,
			String password, Date dateOfBirth) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setBirthOfDate(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
