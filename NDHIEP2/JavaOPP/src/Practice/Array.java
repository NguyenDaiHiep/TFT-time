package Practice;

public class Array {
	public static int giaithua(int n){
		int kq= 1; 
		for (int i = 1; i <=n; i++) {
			kq*=i;
		}
		return kq;
	}
	public static void main(String[] args) {
		System.out.println(giaithua(5));
	}
}
