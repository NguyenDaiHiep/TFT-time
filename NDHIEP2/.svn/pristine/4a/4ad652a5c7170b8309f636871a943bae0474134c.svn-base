package hibernate;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="comments")
public class Comments {
	@Column(name = "date")
	private Date date = new Date();
	private String comment;
	@ManyToOne
	@JoinColumn(name = "idvideo")
	private Video idvideo;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	
	public Comments(){
		
	}
	public Comments( String comment, Video idvideo, User user) {
		this.comment = comment;
		this.idvideo = idvideo;
		this.user= user;
	}
	
	public Date getDate() {
		return date;
	}
	@Column(name="comment")
	public String getComment() {
		return comment;
	}
	
	
	public Video getIdVideo() {
		return idvideo;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setIdVideo(Video idvideo) {
		this.idvideo = idvideo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	

}
