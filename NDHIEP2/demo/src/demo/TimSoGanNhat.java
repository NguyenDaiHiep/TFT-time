package demo;

import java.util.ArrayList;
import java.util.List;

public class TimSoGanNhat {
	public static int timso(int a, int[] array) {
		List list = new ArrayList<>();
		int result = 0;
		int temp = Math.abs(array[0] - a);
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i] - a) < temp) {
				temp = Math.abs(array[i] - a);
				result = array[i];

			}
			

		}
		return result;

	}

	public static void main(String[] args) {
		int a = 5;
		int[] b = { 1, 6, 4, 19, 31 };
		System.out.println(timso(a, b));
	}

}
