package TMAPaintSingleton;

import java.util.ArrayList;

import javax.xml.crypto.Data;

public class TMAPaint {
	


	public TMAPaint() {

	}

	private static  TMAPaint instance = null;

	public static TMAPaint getInstance() {
		if(instance==null){
			instance = new TMAPaint();
		}
		return instance;
	}

	public void draw(int posX, int posY, int with, int height, int darius) {
		if (darius == 0) {
			System.out.println(
					"Hinh vuong co Vi tri: " + posX + " " + posY + " " + "with= " + with + " " + "height= " + height);
		} else {
			System.out.println(
					"Hinh tron co Vi tri: " + posX + " " + posY + " " + "with= " + with + " " + "height= " + height);
		}

	}
	
	

}
