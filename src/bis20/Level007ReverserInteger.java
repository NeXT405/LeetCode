package bis20;

public class Level007ReverserInteger {

	/*
	 * 
	 * Reverse digits of an integer.
	 * 
	 * Example1: x = 123, return 321 Example2: x = -123, return -321
	 * 
	 * click to show spoilers.
	 * 
	 * Note: The input is assumed to be a 32-bit signed integer. Your function
	 * should return 0 when the reversed integer overflows.
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(reverse(-125563123));

	}

	public static int reverse(int x) {
		try {
			int y = String.valueOf(x).length();
			StringBuffer returnString = new StringBuffer("");
			for (int a = y - 1; 0 <= a; a--) {
				returnString.append(String.valueOf(x).charAt(a));
			}
			if (!returnString.toString().endsWith("-")) {
				return Integer.valueOf(returnString.toString());
			} else {
				String test = returnString.toString().replace("-", "");
				return Integer.valueOf("-" + test.toString());
			}
		} catch (Exception e) {
			return 0;
		}

	}
}
