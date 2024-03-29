package tdt.duan2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity extends IntialInforEntity {

	@Column
	private String code;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<ProductEntity>products=new ArrayList<>();
}
