package ndhiep.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;

@Entity
@Table(name="album", catalog= "albumwebspring")
public class AlbumWebSpring{
	private int id;
	private String nameAlbum;
	private String kind;
	
	public AlbumWebSpring(){
		
	}
	

	public AlbumWebSpring(int id, String nameAlbum, String kind) {
		super();
		this.id = id;
		this.nameAlbum = nameAlbum;
		this.kind = kind;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique = true, nullable = false)
	public int getId() {
		return id;
	}
	@Column(name="nameAlbum", nullable = false, length = 255)
	public String getNameAlbum() {
		return nameAlbum;
	}
	@Column(name = "kind", nullable = false, length = 45)
	public String getKind() {
		return kind;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNameAlbum(String nameAlbum) {
		this.nameAlbum = nameAlbum;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	

}
