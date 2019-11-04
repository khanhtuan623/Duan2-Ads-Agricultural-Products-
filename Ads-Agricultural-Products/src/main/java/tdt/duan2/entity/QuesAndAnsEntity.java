package tdt.duan2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="question_and_answer")
public class QuesAndAnsEntity extends IntialInforEntity{

	@Column
	private String code;
	@Column
	private String question;
	@Column
	private String answer;
	@ManyToOne
    @JoinColumn(name = "farmer_id")
    private FarmerEntity farmer;
	
	@ManyToMany(mappedBy = "questions")
    private List<FarmEntity> farms = new ArrayList<>();
}
