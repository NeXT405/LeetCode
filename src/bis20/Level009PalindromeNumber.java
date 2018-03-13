package bis20;

import java.util.ArrayList;

public class Level009PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean isPalindrome(int x) {
		Integer palin = x;
		Integer length = String.valueOf(palin).length();

		if (length == 1) {
			return true;
		}
		ArrayList arrayList = new ArrayList<Integer>();
		try {
			while (palin > 0) {
				arrayList.add(palin % 10);
				palin = palin / 10;
			}

			for (int a = 0; a < length; a++) {
				if (arrayList.get(a) != arrayList.get(length - a - 1)) {
					return false;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
