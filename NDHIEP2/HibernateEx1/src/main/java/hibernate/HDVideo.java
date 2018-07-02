package hibernate;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity

@DiscriminatorValue("2")
public class HDVideo extends Video{

	public HDVideo(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public HDVideo(){
		
	}

	

}
