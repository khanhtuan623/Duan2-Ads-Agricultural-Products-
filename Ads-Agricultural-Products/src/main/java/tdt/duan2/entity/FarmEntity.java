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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="farm")
public class FarmEntity extends IntialInforEntity {

	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
	@ManyToOne
    @JoinColumn(name = "farmer_id")
    private FarmerEntity farmer;
	
	@OneToOne
	@JoinColumn(name="location_id")
	private LocationEntity location;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "farm_question", joinColumns = @JoinColumn(name = "farm_id"), inverseJoinColumns = @JoinColumn(name = "question_and_answer_id"))
	private List<QuesAndAnsEntity> questions = new ArrayList<>();

	@ManyToMany(mappedBy = "farms")
    private List<ProductEntity> products = new ArrayList<>();
}
