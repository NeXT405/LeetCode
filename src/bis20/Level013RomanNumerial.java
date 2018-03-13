package bis20;

public class Level013RomanNumerial {

	public static void main(String[] args) {
		System.out.println(romanToInt2("MMMDLXXXVI"));
	}

	public static int romanToInt2(String s) {
		int r = 0;

		if (s.contains("IV"))
			r -= 2;
		if (s.contains("IX"))
			r -= 2;
		if (s.contains("XL"))
			r -= 20;
		if (s.contains("XC"))
			r -= 20;
		if (s.contains("CD"))
			r -= 200;
		if (s.contains("CM"))
			r -= 200;

		for (int a = 0; a <= s.length() - 1; a++) {
			if (s.charAt(a) == 'M') {
				r += 1000;
				s.replace("M", "");
			}

			if (s.charAt(a) == 'D') {
				r += 500;
				s.replace("D", "");
			}

			if (s.charAt(a) == 'C') {
				r += 100;
				s.replace("C", "");
			}

			if (s.charAt(a) == 'L') {
				r += 50;
				s.replace("L", "");
			}

			if (s.charAt(a) == 'X') {
				r += 10;
				s.replace("X", "");
			}

			if (s.charAt(a) == 'V') {
				r += 5;
				s.replace("V", "");
			}

			if (s.charAt(a) == 'I') {
				r += 1;
				s.replace("I", "");
			}
		}

		return r;
	}

}
