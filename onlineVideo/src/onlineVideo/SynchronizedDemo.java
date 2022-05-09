package onlineVideo;

class counter {
	int count;

	public synchronized void increment() {//synchronied keyword help one thread to complete the tak then allow another threa to start
		count++;
	}

}

public class SynchronizedDemo {

	public static void main(String[] args) throws Exception {
		counter c = new counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int j = 1; j <= 1000; j++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
