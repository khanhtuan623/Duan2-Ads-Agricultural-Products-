package tdt.duan2.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String createBy;
	
	@Temporal( TemporalType.TIMESTAMP )
	@CreationTimestamp
	@Column
	private Date createDate;
	
	@Column
	private String modifyBy;
	
	@UpdateTimestamp
	@Temporal( TemporalType.TIMESTAMP )
	@Column
	private Date modifyDate;

	@Column
	private int status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
