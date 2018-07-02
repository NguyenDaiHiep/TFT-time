package hibernate;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
//@Table(name = "video")
@DiscriminatorValue("1")
public class SDVideo extends Video{
	
	public SDVideo(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public SDVideo(){
		
	}
	

	
	

}
