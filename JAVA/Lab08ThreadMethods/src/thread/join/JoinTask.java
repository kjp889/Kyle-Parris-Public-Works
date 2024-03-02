package thread.join;

public class JoinTask extends Thread{

	public static void main(String[] args) {
		
		JoinTask joinTask1 = new JoinTask();
		JoinTask joinTask2 = new JoinTask();
		JoinTask joinTask3 = new JoinTask();
		
		joinTask1.start();
		
		try {
			joinTask1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		joinTask2.start();
		joinTask3.start();
	}
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println("Count: " +i + "\n");
		}
		
	}

}
