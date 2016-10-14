package javaclasses.main;

public class Producer implements Runnable {
	Box b;
	
	public Producer(Box b){
		this.b = b;
	}
	
String messages [] ={"ravi", "suresh", "nikita"};
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<3; i++)
			try {
				b.put(messages[i]);
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			b.put("done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
