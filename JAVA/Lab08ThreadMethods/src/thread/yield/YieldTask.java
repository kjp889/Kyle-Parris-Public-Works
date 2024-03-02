package thread.yield;

public class YieldTask extends Thread{

	public static void main(String[] args) {
		
		YieldTask task1 = new YieldTask();
		YieldTask task2 = new YieldTask();
		YieldTask task3 = new YieldTask();
		
		task1.start();
		task2.start();
		task3.start();
		for(int i = 1; i <=6; i++) {
			task1.yield();
			System.out.println(Thread.currentThread().getName() + " now in control");
		}
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 6 ; i++) {
			System.out.println(Thread.currentThread().getName() + "has the control");
		}
	}

}
