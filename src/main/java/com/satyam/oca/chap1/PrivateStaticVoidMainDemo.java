// This class compiles but doesn't run
class PrivateStaticVoidMainDemo {
	private static void main(String[] a) {
		System.out.println("Hello!");
	}

	public static void main(String a) {
		System.out.println("Hello!");
	}

	public static void main() {
		System.out.println("Hello!");
	}

	// This function won't compile due to mismatch return type for main
	// public static int main(String[] a) {
	// 	System.out.println("Hello returning 0!");
	// 	return 0;
	// }
}

class AnotherClass {

}