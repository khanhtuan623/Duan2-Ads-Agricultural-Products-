package tdt.duan2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity extends IntialInforEntity {
	
	@Column
	private String name;
	
	@Column(columnDefinition="Text")
	private String description;
	
	@ManyToOne
    @JoinColumn(name = "farmer_id")
    private FarmerEntity farmer;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "product_farm", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "farm_id"))
	private List<FarmEntity> farms = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy = "product")
	private List<CommentEntity>comments =new ArrayList<>();

}
