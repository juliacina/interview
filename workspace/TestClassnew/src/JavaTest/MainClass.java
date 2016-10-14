package JavaTest;

import java.io.File;
import java.io.FileNotFoundException;

public class MainClass {

		
		public static void main(String[] args) throws FileNotFoundException {		
			System.out.println("main method");
			//JavaTest.staticMethod();
			JavaTest j= new JavaSubclass(0);
			j.NONstaticMethod();
			System.out.println("baseclassfield base "+j.baseClassField);
			JavaSubclass k= new JavaSubclass(0);
			k.NONstaticMethod(); 
			System.out.println("baseclassfield sub "+k.baseClassField);
			k = (JavaSubclass) method1(k);

			exceptionMethodTest("sss");
		}
		
		public static JavaTest method1(JavaTest j){
			System.out.println("from method1 "+j.j);
			return j;
		}
		
		public static void exceptionMethodTest(String a) throws FileNotFoundException {
		if (a == null)
			throw new NullPointerException();
	
		}
		
	
	}


