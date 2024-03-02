package thread.sleep;

public class SleepTask extends Thread{

	public static void main(String[] args) {
		
		SleepTask task1 = new SleepTask();
	    SleepTask task2 = new SleepTask();
	    SleepTask task3 = new SleepTask();

	    task1.start();
	    task2.start();
	    task3.start();
	}
	
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println("Count: " + i);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


