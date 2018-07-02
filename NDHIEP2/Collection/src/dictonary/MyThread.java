package dictonary;

import java.util.ArrayList;

public class MyThread extends Thread{
	ReadFileIO re = new ReadFileIO();
	String word;
	ArrayList<String> list= re.find1("h");
	ArrayList<String> list1= re.find1("s");
	String b;
	private String threadName;
	public MyThread(String threadName) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
	}

	@Override
	public void run() {
		try {
			
				for (int i = 0; i < list.size(); i++) {
					b=list.get(i) + "\n";
					System.out.println(b);
					Thread.sleep(2000);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void main(String[] args) {
		MyThread my = new MyThread("1...");
		my.run();
	
	}
	
	
		
	}
	
	



