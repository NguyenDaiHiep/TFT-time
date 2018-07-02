package ndhiep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="album1", catalog= "albumwebspring")
public class Album{
	private int id;
	private String name;
	private String kind;
	
	public Album(){
		
	}
	

	public Album(int id, String name, String kind) {
		this.id = id;
		this.name = name;
		this.kind = kind;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique = true, nullable = false)
	public int getId() {
		return id;
	}
	@Column(name="name", nullable = false, length = 255)
	public String getName() {
		return name;
	}
	@Column(name = "kind", nullable = false, length = 45)
	public String getKind() {
		return kind;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	

}
