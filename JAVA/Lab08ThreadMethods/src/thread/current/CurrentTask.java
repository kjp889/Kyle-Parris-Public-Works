package thread.current;

public class CurrentTask extends Thread{

	public static void main(String[] args) {
		CurrentTask currentTask1 = new CurrentTask();
		CurrentTask currentTask2 = new CurrentTask();
		CurrentTask currentTask3 = new CurrentTask();
		
		currentTask1.start();
		currentTask2.start();
		currentTask3.start();


	}
	
	@Override
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		System.out.println("Thread ID: "+ Thread.currentThread().getId());
		System.out.println("Priority Level: "+ Thread.currentThread().getPriority());
		System.out.println("Thread State: " + Thread.currentThread().getState());
	}

}
