package tdt.duan2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class ImageEntity extends IntialInforEntity {

	@Column
	private String name;
	
	@OneToOne(mappedBy = "avatar")
    private ProfileEntity profile;
	
	@OneToOne
    @JoinColumn(name = "farmer_id")
    private FarmerEntity farmer;
}
