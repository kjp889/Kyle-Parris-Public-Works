package thread.setpriority;

public class SetPriorityTask implements Runnable{

	public static void main(String[] args) {
		
		SetPriorityTask priority1 = new SetPriorityTask();
		SetPriorityTask priority2 = new SetPriorityTask();
		SetPriorityTask priority3 = new SetPriorityTask();
		
		Thread thread1 = new Thread(priority1);
		Thread thread2 = new Thread(priority2);
		Thread thread3 = new Thread(priority3);
		
		thread2.setPriority(10);
		thread3.setPriority(1);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " | Priority: " + Thread.currentThread().getPriority());		
	}

}
