package JavaTest;

public class JavaTest {
	int baseClassField = 100;
	static int i = 2;
	static {
		System.out.println("static initializer");
		System.out.println("i value "+i);
	}
	
	int j = 4;
	 {
		System.out.println("non static initializer");
		System.out.println("J value "+j);
	}
int m =3;
static int n = 4;

	public static void staticMethod(){
		int k = 4;
		System.out.println("static method"+k);
		System.out.println("static method");
		System.out.println("method i value "+i);
	}
	
	public JavaTest(int i){
		
	
		System.out.println("constructor");
	}
	
	public JavaTest(){
				
		System.out.println("no arg constructor");
	}
	
	
	void NONstaticMethod(){
		System.out.println("NON static method");
		System.out.println("method i value "+i);
	}
	
	
	


}
