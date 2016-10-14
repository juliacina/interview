package javaclasses.test;

import javaclasses.main.Box;
import javaclasses.main.Consumer;
import javaclasses.main.Producer;

public class ProdConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		Thread t1 = new Thread(new Producer(b));
		t1.start();
		Thread t2 = new Thread (new Consumer(b));
		t2.start();

	}

}
