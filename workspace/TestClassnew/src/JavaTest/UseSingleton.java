package JavaTest;

public class UseSingleton {

	public static void main(String[] args) {
		SingletonTest s = SingletonTest.getInstance();
		SingletonTest s1 = SingletonTest.getInstance();
		if (s == s1) System.out.println("both are same");

	}

}
