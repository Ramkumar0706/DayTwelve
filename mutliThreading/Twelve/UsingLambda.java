package mutliThreading.Twelve;

public class UsingLambda {
	
	public static void main(String[] args) {
		Thread t6=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("thread6");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t7=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("thread7");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t6.start();
		t7.start();
	}

}
