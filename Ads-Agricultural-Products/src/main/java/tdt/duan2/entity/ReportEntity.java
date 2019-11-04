package tdt.duan2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="report")
public class ReportEntity extends IntialInforEntity {
	@Column
	private String title;
	
	@Column 
	private String content;
	
	@Column
	private long reportFrom;
	
	@Column
	private long reportTo;
	
	@Column
	private long handelBy;
	
	@Column
	private int history;
}
