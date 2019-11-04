package tdt.duan2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class RoleEntity extends IntialInforEntity {

	@Column
	private String code;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();
	
	public RoleEntity() {
		super();
	}
	
	public RoleEntity(String code, String name, String description, List<UserEntity> users) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.users = users;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
	
	
	
}
