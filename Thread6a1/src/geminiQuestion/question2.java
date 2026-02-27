package geminiQuestion;

class AkaunBank {
    private int baki = 200;

    public synchronized void withdraw(String nama, int jumlah) {
        if (baki >= jumlah) {
            System.out.println(nama + " sedang withdraw RM" + jumlah);
            try { Thread.sleep(1000); } catch (Exception e) {} 
            baki -= jumlah;
            System.out.println("✅ " + nama + " Berjaya! Baki tinggal: RM" + baki);
        } else {
            System.out.println("❌ " + nama + " Gagal! Baki tak cukup.");
        }
    }
}


public class question2 {

	public static void main(String[] args) {
		
		AkaunBank akaunKongsi = new AkaunBank();

        Thread user1 = new Thread(() -> akaunKongsi.withdraw("Ali", 150));
        Thread user2 = new Thread(() -> akaunKongsi.withdraw("Abu", 150));

        user1.start();
        user2.start();

	}

}
