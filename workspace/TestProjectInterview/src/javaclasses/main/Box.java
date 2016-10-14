package javaclasses.main;

public class Box {
	String message;
	boolean empty=true;
	public synchronized String take() throws InterruptedException{
		if (empty) wait();
		empty=true;
		notifyAll();
		return message;
	}
	
	public synchronized void put(String m) throws InterruptedException{
		if (!empty) wait();		
		message = m;
		empty=false;
		notifyAll();
	}
	

}
