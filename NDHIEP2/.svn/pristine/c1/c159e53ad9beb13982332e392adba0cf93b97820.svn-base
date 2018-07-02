package dictonary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReadFileIO {

	public ReadFileIO() {

	}
	static HashMap<String, String> hm = new HashMap<>();


	private static String filePath = "D:\\data.txt";

	private  HashMap<String, String> readFile(String filePath) {
		HashMap<String, String> Hm = new HashMap<String, String>();
		File f = new File(filePath);
		if (f.exists()) {
			try {
				FileReader fr = new FileReader(filePath);
				String line = "";
				BufferedReader bf = new BufferedReader(fr);

				if ((line = bf.readLine()) != null) {
					while ((line = bf.readLine()) != null) {
						String[] split = line.split(":");
						Hm.put(split[0], split[1]);
					}
				}
				fr.close();
				bf.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return Hm;
	}

//	public static void find(String input) {
//		ReadFileIO.readFile(filePath).entrySet().stream().filter(s->s.getKey().startsWith(input))
//		.forEach(System.out::println);
		
		

//		hm.putAll(readFile(filePath));
//		List<Map.Entry<String, String>> listMap = new ArrayList<Map.Entry<String, String>>();
//				
//				
//		//listMap.addAll(hm.entrySet());
//		// Stream<Entry<String, String>> stream = listMap.stream();
//		// listMap.stream().filter(s->s.getKey().startsWith(input)).forEach(System.out::println);
//		// stream.filter(s->s.getKey().startsWith(input)).forEach(System.out::println);
//		hm.entrySet().stream().filter(s -> s.getKey().startsWith(input)).forEach(System.out::println);
		

	//}
	public ArrayList<String> find1(String word){
		ArrayList<String> arr = new ArrayList<>();
		String temp;
		
		try{
			File f = new File(filePath);
			BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF-8"));
		while((temp = buf.readLine())!=null ){
			if(temp.startsWith(word)){
				arr.add(temp);
			
				
				
			}
			
		}
		buf.close();
			
		}catch(IOException e){
		}
		Collections.sort(arr);
		return arr;
		
		
		
	}
//	public static void main(String[] args) {
//		System.out.println(getArr(find1("h")));
//	}
	

	public  String search(String s) {
		HashMap<String, String> readF = readFile(filePath);
		if (!readF.containsKey(s)) {
			return "tu dien chua cap nhat tu nay!";
		} else {
			return readF.get(s);
		}
	}
	

	public String getArr(ArrayList<String> arr) {
		String a = "";
		for (int i = 0; i < arr.size(); i++) {
			a += arr.get(i) + "\n";
		}
		return a;
	}
	
	

	

	
}
