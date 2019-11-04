package tdt.duan2.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class BaseProfile extends BaseEntity {

	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private Date birthDate;
	@Column
	private String email;
	@Column
	private String address;
	@Column
	private char sex;
	@Column
	private String avatar;
	public BaseProfile() {
		super();
	}
	public BaseProfile(String name, String phone, Date birthDate, String email, String address, char sex,
			String avatar) {
		super();
		this.name = name;
		this.phone = phone;
		this.birthDate = birthDate;
		this.email = email;
		this.address = address;
		this.sex = sex;
		this.avatar = avatar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	
}
