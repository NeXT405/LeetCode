package bis20;

import java.util.ArrayList;
import java.util.List;

public class Level020ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("([])"));
		System.exit(1);
	}

	public static boolean isValid(String s) {
		List<Character> list = new ArrayList();

		for (int a = 0; a < s.length(); a++) {
			list.add(s.charAt(a));
		}
		boolean t = false;
		try {
			t = rec(s, 0);
		} catch (Exception e) {
			return false;
		}
		return t;
	}

	public static boolean rec(String s, int index) {
		if (isOdd(s)) {
			return false;
		}

		boolean removed = false;

		boolean isOk = false;

		if (s.charAt(index) == '(') {
			if (s.charAt(index + 1) == ')') {
				s = s.substring(0, index) + s.substring(index + 2);
				removed = true;
				if (isOdd(s)) {
					return false;
				} else if (s.length() == 0) {
					return true;
				} else {
					isOk = rec(s, 0);
				}
			}
		}
		if (s.charAt(index) == '{') {
			if (s.charAt(index + 1) == '}') {
				s = s.substring(0, index) + s.substring(index + 2);
				removed = true;
				if (isOdd(s)) {
					return false;
				} else if (s.length() == 0) {
					return true;
				} else {
					isOk = rec(s, 0);
				}
			}
		}
		if (s.charAt(index) == '[') {
			if (s.charAt(index + 1) == ']') {
				s = s.substring(0, index) + s.substring(index + 2);
				removed = true;
				if (isOdd(s)) {
					return false;
				} else if (s.length() == 0) {
					return true;
				} else {
					isOk = rec(s, 0);
				}
			}
		}

		if (!removed) {
			index++;
			isOk = rec(s, index);
		}

		return isOk;

	}

	private static boolean isOdd(String s) {
		if (s.length() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
