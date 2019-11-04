package tdt.duan2.model;

public class Profile {
	private long id;
	private String createBy;
	private String name;
	private String phone;
	private String birthDate;
	private String email;
	private String address;
	private char sex;
	private String avatar;
	private String userName;
	private String passWord;
	
	
	public Profile() {
		super();
	}
	public Profile(String createBy, String name, String phone, String birthDate, String email, String address, char sex,
			String avatar, String userName, String passWord) {
		super();
		this.createBy = createBy;
		this.name = name;
		this.phone = phone;
		this.birthDate = birthDate;
		this.email = email;
		this.address = address;
		this.sex = sex;
		this.avatar = avatar;
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
