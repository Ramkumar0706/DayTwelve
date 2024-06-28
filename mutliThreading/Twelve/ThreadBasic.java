package mutliThreading.Twelve;

public class ThreadBasic  extends Thread{
	@SuppressWarnings("deprecation")
	synchronized public static void main(String[] args) {
		ThreadBasic t=new ThreadBasic();

		System.out.println("Getting the Current Thread Id");
		System.out.println(t.getId()+"\n");

		System.out.println("Getting the Current Thread Name");
		System.out.println(t.getName()+"\n");

		System.out.println("Getting the Current Thread Priorty");
		System.out.println(t.getPriority()+"\n");

		System.out.println("Getting the Current Thread StackTrace");
		System.out.println(t.getStackTrace()+"\n");


		System.out.println("checking the current thread is Alive or not");
		System.out.println(t.isAlive()+"\n");

		System.out.println("Getting the Current Thread Daemon");
		System.out.println(t.isDaemon()+"\n");

		System.out.println("Getting the Current Thread Id");
		System.out.println(t.threadId()+"\n");

		System.out.println("Getting the Current Thread states");
		System.out.println(t.getState()+"\n");

		System.out.println("Getting the Current Thread is interrupted");
		System.out.println(Thread.interrupted()+"\n");

		// this method is used to set the priority of the thread
		t.setPriority(9);
		System.out.println("after changing the priority ");
		System.out.println(t.getPriority()+"\n");

		// this method is used to set the priority of the thread
		t.setName("demo Thread");;
		System.out.println("after changing the Thread Name ");
		System.out.println(t.getName()+"\n");




	}

}
