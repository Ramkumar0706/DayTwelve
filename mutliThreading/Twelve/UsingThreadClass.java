package mutliThreading.Twelve;

class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Thread2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}

public class UsingThreadClass{
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}
