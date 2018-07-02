package hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	private int id;
	@Column(name = "nickName")
	private String nickName;
	private String email;

	public User() {

	}

	public User(String nickName, String email) {
		this.nickName = nickName;
		this.email = email;
	}

	
	public String getNickName() {
		return nickName;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	public Set<Comments> setComment;
	@OneToMany(mappedBy= "user", cascade = CascadeType.ALL)
	public Set<Video> setVideo;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void author(Video video){
		video.setAuthor(this);
	}

}
