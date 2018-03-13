package bis20;

public class Test {

	public static void main(String[] args) {

		test();

	}

	public static void test() {
		int in = 123;
				
		while (in != 0){
			System.out.println(in % 10);
			in = in / 10;
		}
	}
}
