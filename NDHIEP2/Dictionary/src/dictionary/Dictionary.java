package dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Value v = new Value();
		Key k = new Key();
		int n;
		System.out.println("Nhap so tu cho tu dien");
		n = sc.nextInt();
		
		HashMap hm  = new HashMap(n);
		for (int i = 0; i < n; i++) {
			k.nhap();
			v.nhap();
			hm.put(k.getEnglish(), v.getVietnamese());
		}
		System.out.println(hm);
		
		sc.nextLine();
		System.out.println("Nhap nghia cua tu can tim");
		String s = sc.nextLine();
		if(hm.containsKey(s)){
			System.out.println("nghia cua tu " + s + " la: " + hm.get(s));
		}
		
		
	}

}
