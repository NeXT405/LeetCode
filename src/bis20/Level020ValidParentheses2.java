package bis20;

public class Level020ValidParentheses2 {

	public static void main(String[] args) {
		System.out.println(isValid("([])()}(){("));
		System.exit(1);
	}

	public static boolean isValid(String s) {
		return rec(s);
	}

	public static boolean rec(String s) {
		if (isOdd(s)) {
			return false;
		}

		if (s.contains("()")) {
			s = s.replace("()", "");
			return rec(s);
		} else if (s.contains("[]")) {
			s = s.replace("[]", "");
			return rec(s);
		} else if (s.contains("{}")) {
			s = s.replace("{}", "");
			return rec(s);
		} else if (s.length() == 0) {
			return true;
		}
		return false;
	}

	private static boolean isOdd(String s) {
		if (s.length() % 2 != 0)
			return true;
		else
			return false;

	}
}
