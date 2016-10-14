package JavaTest;

public class SingletonTest {
	private static SingletonTest instance = null;
	private SingletonTest(){
		System.out.println("private constructor");
	}
	public static SingletonTest getInstance(){
		if (instance == null) instance = new SingletonTest();
		return instance;
	}

}
