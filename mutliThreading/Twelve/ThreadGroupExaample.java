package mutliThreading.Twelve;


class Main implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadGroupExaample {
	public static void main(String[] args) {
		ThreadGroup tb=new ThreadGroup("Parent Thread");
		Thread t1=new Thread(tb,new Main(),"One");
		Thread t2=new Thread(tb,new Main(),"Two");
		Thread t3=new Thread(tb,new Main(),"Three");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tb.getParent());
	}
}
