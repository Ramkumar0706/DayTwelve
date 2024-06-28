package mutliThreading.Twelve;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread3");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
class Thread4 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread4");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}

class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread5");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
public class UsingJoinMethod  {
	public static void main(String[] args) throws InterruptedException {
		Thread3 t3=new Thread3();
		Thread4 t4=new Thread4();
		Thread5 t5=new Thread5();
		t3.start();
		t4.start();
		t4.join();
		t5.start();
	}

}
