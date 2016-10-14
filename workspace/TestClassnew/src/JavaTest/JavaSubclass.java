package JavaTest;

public class JavaSubclass extends JavaTest {
	int baseClassField = 200;

	JavaSubclass(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void NONstaticMethod(){
		System.out.println("subclass NON static method");
		
	}
	

}
