package mthread;

	class ThreadRunner extends Thread {
		private Thread t ;
		private String tName;

		ThreadRunner(String name) {
			tName = name;
		}

		public void start() {
			System.out.println("Starting "+tName);
			if (t==null) {
				t = new Thread(this,tName);
			};
			t.start();
		}

		public void run() {	
			System.out.println("Running "+tName);
			try {
				for (int i=4;i>0;i--) {
					System.out.println("     Thread "+tName+"  "+i);
					Thread.sleep(50);
				}
			}
			catch (InterruptedException e ) {
				System.out.println("Interrupted "+tName);
			}
		}
	}

	public class Test02 {
		public static void main( String [] argsv) {	
			ThreadRunner t1 = new ThreadRunner("hilo 1");
			t1.start();
			ThreadRunner t2 = new ThreadRunner("hilo 2");
			t2.start();	
		}
}