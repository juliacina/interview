package javaclasses.test;
import org.junit.Test;

import javaclasses.main.Thread1;
import javaclasses.main.Thread2;

public class ThreadTest {
	
	public static void main(String[] args){
		Thread t = new Thread(new Thread1());
		t.start();
		Thread t1 = new Thread(new Thread2());
		t1.start();
	}
	
}
