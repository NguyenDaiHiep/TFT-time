package hibernate;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorColumn(
	name="SD",
	discriminatorType = DiscriminatorType.INTEGER
)
@Table(name = "video")
@DiscriminatorValue("null")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name = "date")
	private Date date = new Date();
	@Column(name = "title")
	private String title;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User author;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="idVideo")
	private Set<Comments> comments;

	public Video(String title) {

		this.title = title;
	}
	public Video(){
		
	}


	public Date getDate() {
		return date;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public User getAuthor() {
		return author;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Comments> getComments() {
		return comments;
	}

	public void setComments(Set<Comments> comments) {
		this.comments = comments;
	}
	
	

	
	
}
