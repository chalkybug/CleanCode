package generic;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelect {
	public static void main(String[] args) {
		// kiểm tra với mảng số
		ArrayList<Object> arr_number = new ArrayList<Object>();
		arr_number.add(1);
		arr_number.add(2);
		arr_number.add(3);
		arr_number.add(4);
		String res_number = randomSelect(arr_number);
		System.out.println(res_number);

		// kiểm tra với mảng string
		ArrayList<Object> arr_string = new ArrayList<Object>();
		arr_string.add("A");
		arr_string.add("B");
		arr_string.add("C");
		arr_string.add("D");
		String res_string = randomSelect(arr_string);
		System.out.println(res_string);
	}

	public static <E> String randomSelect(ArrayList<E> array) {
		// hiern thị mội gia trị bất kỳ
		Random rd = new Random();
		int number = rd.nextInt(array.size()); // trả về 1 số nguyên bất kỳ
		return array.get(number).toString();
	}
}
