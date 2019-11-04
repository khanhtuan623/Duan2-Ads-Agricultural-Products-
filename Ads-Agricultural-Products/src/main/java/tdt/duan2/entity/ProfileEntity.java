package tdt.duan2.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Profile")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class ProfileEntity extends IntialInforEntity {

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
	
	@OneToOne
	@JoinColumn(name="image_id",referencedColumnName="id")
	private ImageEntity avatar;

}
