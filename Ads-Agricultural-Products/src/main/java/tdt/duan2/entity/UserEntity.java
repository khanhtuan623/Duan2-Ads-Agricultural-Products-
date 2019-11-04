package tdt.duan2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserEntity extends BaseProfile {
	
	@Column
	private String userName;
	
	@Column
	private String passWord;

	
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
