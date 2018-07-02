package TMAPaintSingleton;

import java.util.ArrayList;

public class TestSingleton {
	public static void main(String[] args) {
		TMAPaint singleton = TMAPaint.getInstance();
		TMAPaint singleton2 = TMAPaint.getInstance();
		singleton.draw(20, 20, 50, 70, 0);
		singleton2.draw(10, 20, 50, 50, 50);
		singleton.draw(20, 20, 100, 60, 0);
		
		

		
		
		
		
	}

}
