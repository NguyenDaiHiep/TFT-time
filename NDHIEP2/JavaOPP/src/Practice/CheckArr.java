package Practice;

public class CheckArr {
	public static boolean checkArr(int[] arr1, int[] arr2){
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]){
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] a1 = {1,2,5,6};
		int[] a2 = {1,3};
		System.out.println(checkArr(a1, a2));
	}

}
