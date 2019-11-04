package tdt.duan2.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="Persistent_Login")
public class PersistentLogin {

	@Id
	private String series;
	
	@Column(nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String token;
	
	@Column(name="late_user")
	@CreationTimestamp
	private Date lastUser;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLastUser() {
		return lastUser;
	}

	public void setLastUser(Date lastUser) {
		this.lastUser = lastUser;
	}
	
	
}
