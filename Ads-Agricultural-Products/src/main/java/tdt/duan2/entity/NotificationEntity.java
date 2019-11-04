package tdt.duan2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="notification")
public class NotificationEntity extends IntialInforEntity {

	@Column
	private String content;
	
	@Column
	private int active;
	
	@OneToOne
	@JoinColumn(name="comment_id",referencedColumnName="id")
	private CommentEntity comment;
}
