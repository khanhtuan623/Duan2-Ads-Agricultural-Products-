package tdt.duan2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class CommentEntity extends IntialInforEntity{
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	@Column
	private long subComment;
	
	@OneToOne
	@JoinColumn(name="product_id")
	private ProductEntity product;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	@OneToOne(mappedBy = "comment")
    private NotificationEntity notification;

}
