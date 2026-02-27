package geminiQuestion;

class CounterTask implements Runnable {
	
	String name;
	
	public CounterTask (String name) {
		this.name = name;
	}
	
	public synchronized void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + " kira: " + i);
			
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				
			}
		}
	}
}

public class question3 {

	public static void main(String[] args) {

		Thread user1 = new Thread(new CounterTask("Amir"));
		Thread user2 = new Thread(new CounterTask("Sarah"));
		
		user1.start();
		user2.start();
		
	}

}
