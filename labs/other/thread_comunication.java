package other;

public class thread_comunication {
	public static void main(String[] args) throws InterruptedException {
		ThreadB obj = new ThreadB();
		obj.start();
		synchronized (obj) {
			System.out.println("Main thread calls wait() method..");
			obj.wait();// suspends the main thread until ThreadB notifies.
			System.out.println("Main thread got notification...");
			System.out.println("Total:::" + obj.total);
		}
	}
}


class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("ThreadB starts....");
			for (int i = 1; i <= 10; i++) {
				total += i;
			}
			System.out.println("ThreadB giving notification");
			this.notify();
		}
	}
}