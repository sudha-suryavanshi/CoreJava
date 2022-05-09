package onlineVideo;

//Lambda Expression with multiple join and isalive method using thread
public class LambdaExpressionDemo {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int j = 1; j <= 5; j++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		t1.setName("Hi Thread");//Give the name of the thraed
		t2.setName("Hello Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);//setting pripority 1 is minimum and 10 is maximum
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
		System.out.println(t1.isAlive());

		t1.join();
		t2.join();
		// System.out.println(t1.isAlive());
		System.out.println("Bye....");
	}
}
