package threaderizer;

public class WakeMeUP {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				System.out.println("Starting new thread ");
			}
		};
		final Thread t2 = new Thread() {
			public void run() {
				System.out.println("Starting new thread ");
			}
		}; 
		while(true) {
			try {
				t1.run();
				t2.run();
				System.out.println(t1.getName() + " /t going to sleep");
				System.out.println(t2.getName() + "  going to sleep");
				t2.sleep(5000);
				t1.sleep(10000);
				System.out.println(t2.getName() + " waking up from sleep");
				System.out.println(t1.getName() + " /t waking up from sleep");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}