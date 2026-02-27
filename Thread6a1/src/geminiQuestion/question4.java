package geminiQuestion;

class SistemTiket {
	int stokTiket = 1;
	
	public synchronized void beliTiket(String name) {
		if (stokTiket > 0) {
			stokTiket--;
		}
		else {
			System.out.println("Slot tiket dah habis!");
		}
	}
}

public class question4 {

	public static void main(String[] args) {
		
		SistemTiket st = new SistemTiket();

		Thread user1 = new Thread(() -> st.beliTiket(null));
		Thread user2 = new Thread(() -> st.beliTiket(null));
		
		user1.start();
		user2.start();
		
	}

}
