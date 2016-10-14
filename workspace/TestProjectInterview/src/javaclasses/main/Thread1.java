package javaclasses.main;

public class Thread1 implements Runnable {
	public void run() {
String name = Thread.currentThread().getName();
		for (int i = 1; i<10; i++){
			try {
				Thread.currentThread().sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " "+i);
			
				
			
		}
	}	

}
