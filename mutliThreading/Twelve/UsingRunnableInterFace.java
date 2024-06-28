package mutliThreading.Twelve;

class Runnable1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
		
		System.out.println("Using Runnable Interface 1");		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		}

	}
}

class Runnable2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
		
		System.out.println("Using Runnable Interface 2");		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		}

	}
}

public class UsingRunnableInterFace {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable1());
		Thread t2=new Thread(new Runnable2());
		t1.start();
		t2.start();
	}

}


