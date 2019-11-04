package tdt.duan2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="farmer")
public class FarmerEntity extends UserEntity {

	@OneToMany(mappedBy = "farmer")
	private List<FarmEntity>farms =new ArrayList<>();
	
	@OneToMany(mappedBy = "farmer")
	private List<ImageEntity>images =new ArrayList<>();
	
	@OneToMany(mappedBy = "farmer")
	private List<ProductEntity>products =new ArrayList<>();
	
	@OneToMany(mappedBy = "farmer")
	private List<QuesAndAnsEntity>listQuesAndAns =new ArrayList<>();
	
}
